package madoku.craft.java.utility;

import madoku.craft.java.core.module.MadokuClientRuntime;
import madoku.craft.java.core.module.MadokuModule;
import madoku.craft.java.core.module.MadokuModuleIds;
import net.fabricmc.api.ClientModInitializer;

/** Fabric client entrypoint for the standalone Utility jar. */
public final class MadokuUtilityClientInitializer implements ClientModInitializer, MadokuModule {
	@Override public net.minecraft.resources.Identifier id() { return MadokuModuleIds.UTILITY; }
	@Override public void onInitializeClient() { MadokuClientRuntime.initialize(this); }
	@Override public void initialize() { MadokuUtilityClient.initialize(); }
}
