package com.example.pws;

import net.fabricmc.api.ModInitializer;

public class PwsMod implements ModInitializer {
    public static final String MOD_ID = "pws";

    @Override
    public void onInitialize() {
        System.out.println("If you read this, your a nerd!");
        PwsTools.registerTools();
        PwsArmor.registerArmor();
        PwsItemGroups.PWS_GROUP.getDisplayName();
    }
}