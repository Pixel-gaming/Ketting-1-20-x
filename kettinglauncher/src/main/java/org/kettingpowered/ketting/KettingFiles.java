package org.kettingpowered.ketting;

import org.kettingpowered.ketting.internal.KettingConstants;
import org.kettingpowered.ketting.internal.utils.JarTool;

import java.io.File;

public class KettingFiles {
    public static final String DATA_DIR = "data/";

    private static final String
            MC = KettingConstants.MINECRAFT_VERSION,
            FORGE = KettingConstants.FORGE_VERSION,
            MCP = KettingConstants.MCP_VERSION,
            MC_FORGE = MC + "-" + FORGE,
            MC_FORGE_KETTING = MC + "-" + FORGE + "-" + KettingConstants.KETTING_VERSION,
            MC_MCP = MC + "-" + MCP;

    public static final String LIBRARIES_PATH = new File(JarTool.getJarDir(), KettingConstants.INSTALLER_LIBRARIES_FOLDER).getAbsolutePath() + "/";
    public static final String LOGS_PATH = new File(System.getProperty("user.dir"), "logs").getAbsolutePath() + "/";
    public static final File FORGE_BASE_DIR = new File(LIBRARIES_PATH, "net/minecraftforge/");
    public static final File KETTINGSERVER_BASE_DIR = new File(LIBRARIES_PATH, "org/kettingpowered/server");
    public static final File MCP_BASE_DIR = new File(LIBRARIES_PATH, "de/oceanlabs/mcp_config/" + MC_MCP + "/");
    public static final File NMS_BASE_DIR = new File(LIBRARIES_PATH, "net/minecraft/server/" + MC + "/");
    public static final File NMS_PATCHES_DIR = new File(LIBRARIES_PATH, "net/minecraft/server/" + MC_MCP + "/");
    public static final File INSTALL_DIR = new File(KETTINGSERVER_BASE_DIR, "install/");

    public static final String
            FMLCORE_NAME = "fmlcore-" + MC_FORGE_KETTING + ".jar",
            FMLLOADER_NAME = "fmlloader-" + MC_FORGE_KETTING + ".jar",
            JAVAFMLLANGUAGE_NAME = "javafmllanguage-" + MC_FORGE_KETTING + ".jar",
            LOWCODELANGUAGE_NAME = "lowcodelanguage-" + MC_FORGE_KETTING + ".jar",
            MCLANGUAGE_NAME = "mclanguage-" + MC_FORGE_KETTING + ".jar";

    public static final File
            FMLCORE = new File(KETTINGSERVER_BASE_DIR, "fmlcore/" + MC_FORGE_KETTING + "/" + FMLCORE_NAME),
            FMLLOADER = new File(KETTINGSERVER_BASE_DIR, "fmlloader/" + MC_FORGE_KETTING + "/" + FMLLOADER_NAME),
            JAVAFMLLANGUAGE = new File(KETTINGSERVER_BASE_DIR, "javafmllanguage/" + MC_FORGE_KETTING + "/" + JAVAFMLLANGUAGE_NAME),
            LOWCODELANGUAGE = new File(KETTINGSERVER_BASE_DIR, "lowcodelanguage/" + MC_FORGE_KETTING + "/" + LOWCODELANGUAGE_NAME),
            MCLANGUAGE = new File(KETTINGSERVER_BASE_DIR, "mclanguage/" + MC_FORGE_KETTING + "/" + MCLANGUAGE_NAME);

    public static final String
            FORGE_UNIVERSAL_NAME = "forge-" + MC_FORGE_KETTING + "-universal.jar";

    public static final File
            FORGE_UNIVERSAL_JAR = new File(KETTINGSERVER_BASE_DIR, "forge/" + MC_FORGE_KETTING + "/" + FORGE_UNIVERSAL_NAME),
            FORGE_PATCHED_JAR = new File(KETTINGSERVER_BASE_DIR, "forge/" + MC_FORGE_KETTING + "/forge-" + MC_FORGE_KETTING + "-server.jar");

    public static final File
            MCP_ZIP = new File(MCP_BASE_DIR, "mcp_config-" + MC_MCP + ".zip"),
            SERVER_JAR = new File(NMS_BASE_DIR, "server-" + MC + ".jar"),
            SERVER_UNPACKED = new File(NMS_PATCHES_DIR, "server-" + MC_MCP + "-unpacked.jar"),
            SERVER_SLIM = new File(NMS_PATCHES_DIR, "server-" + MC_MCP + "-slim.jar"),
            SERVER_EXTRA = new File(NMS_PATCHES_DIR, "server-" + MC_MCP + "-extra.jar"),
            SERVER_SRG = new File(NMS_PATCHES_DIR, "server-" + MC_MCP + "-srg.jar"),
            MCP_MAPPINGS = new File(MCP_BASE_DIR, "mappings.txt"),
            MOJANG_MAPPINGS = new File(NMS_PATCHES_DIR, "mappings.txt"),
            MERGED_MAPPINGS = new File(MCP_BASE_DIR, "mappings-merged.txt"),
            SERVER_LZMA = new File(INSTALL_DIR, "server.lzma");

    public static final File
            STORED_HASHES = new File(INSTALL_DIR, "hashes.txt"),
            PATCHER_LOGS = new File(LOGS_PATH, "install.txt");
}
