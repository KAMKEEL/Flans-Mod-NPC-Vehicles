package com.wolffsmod;

import com.wolffsmod.network.FlanEntitySyncPacket;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;
import net.minecraftforge.common.config.Configuration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = Strings.MOD_ID, name = Strings.MOD_NAME, version = Strings.MOD_VERSION, dependencies="after: customnpcs; required-after: flansmod")

public class WolffNPCMod
{
	@SidedProxy(clientSide = "com.wolffsmod.ClientProxy", serverSide = "com.wolffsmod.ServerProxy")
	public static ServerProxy PROXY;
	
	@Instance(Strings.MOD_ID)
	public static WolffNPCMod INSTANCE;

	public static Configuration config;

	public static SimpleNetworkWrapper network;

	public static Logger logger = LogManager.getLogger("Wolff's NPC Vehicles");

	public static boolean ignoreFrustumCheckForNpcVehicles = true;
	public static boolean ignoreFrustumCheckForLargeEntities = true;
	public static boolean shootingParticles = true;
	public static float entityUpdateRange = 512F;
	public static float largeEntitySize = 5F;

	@EventHandler
	public static void preInit(FMLPreInitializationEvent event)
	{
		config = new Configuration(event.getSuggestedConfigurationFile());

		entityUpdateRange = config.getFloat(
				"Entity update range",
				"General Settings",
				entityUpdateRange,
				0F,
				1024F,
				"Range in blocks for NPC vehicles to be updated");
		shootingParticles = config.getBoolean(
				"Shooting particles",
				"General Settings",
				shootingParticles,
				"Enable shooting particles for some vehicles");
		ignoreFrustumCheckForNpcVehicles = config.getBoolean(
				"Ignore frustum check for NPC vehicles",
				"Client Side Settings",
				ignoreFrustumCheckForNpcVehicles,
				"Rendering fix for all NPC vehicles, set to false if you experience performance issues");
		ignoreFrustumCheckForLargeEntities = config.getBoolean(
				"Ignore frustum check for large entities",
				"Client Side Settings",
				ignoreFrustumCheckForLargeEntities,
				"Rendering fix for large NPC entities, set to false if you experience performance issues");
		largeEntitySize = config.getFloat(
				"Large NPC entity size",
				"Client Side Settings",
				largeEntitySize,
				0F,
				64F,
				"Ignore frustum check for entities with a hit box width or height greater than this value");

		ContentPacks.loadPacksConfig(config);

		if (config.hasChanged())
			config.save();

		network = NetworkRegistry.INSTANCE.newSimpleChannel("EntitySyncChannel");
		network.registerMessage(FlanEntitySyncPacket.Handler.class, FlanEntitySyncPacket.class, 0, Side.CLIENT);
	}

	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		ModEntityRegistry.registerEntities();
		PROXY.registerRenderers();
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {}

	// Only for debug
	/*@EventHandler
	public void serverLoad(FMLServerStartingEvent event)
	{
		event.registerServerCommand(new CommandModelUpdate());
	}*/

}
