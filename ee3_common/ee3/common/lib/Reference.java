package ee3.common.lib;

/**
 * Reference
 * 
 * General purpose library to contain mod related constants
 * 
 * @author pahimar
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class Reference {

    /* Debug Mode On-Off */
    public static final boolean DEBUG_MODE = false;

    /* General Mod related constants */
    public static final String MOD_ID = "EE3";
    public static final String MOD_NAME = "Equivalent Exchange 3";
    public static final String VERSION = "@VERSION@";
    public static final String CHANNEL_NAME = MOD_ID;
    public static final int SECOND_IN_TICKS = 20;
    public static final int SHIFTED_ID_RANGE_CORRECTION = 256;
    public static final String SERVER_PROXY_CLASS = "ee3.common.core.CommonProxy";
    public static final String CLIENT_PROXY_CLASS = "ee3.client.core.ClientProxy";

    /* KeyBinding related constants */
    public static final String KEYBINDING_EXTRA = "key.extra";
    public static final int KEYBINDING_EXTRA_DEFAULT = 46;
    public static final String KEYBINDING_RELEASE = "key.release";
    public static final int KEYBINDING_RELEASE_DEFAULT = 19;
    public static final String KEYBINDING_TOGGLE = "key.toggle";
    public static final int KEYBINDING_TOGGLE_DEFAULT = 34;
    public static final String KEYBINDING_CHARGE = "key.charge";
    public static final int KEYBINDING_CHARGE_DEFAULT = 47;

    /* General Tile Entity related constants */
    public static final String TE_GEN_OWNER_NBT_TAG_LABEL = "owner";
    public static final String TE_GEN_STATE_NBT_TAG_LABEL = "state";
    public static final String TE_GEN_DIRECTION_NBT_TAG_LABEL = "direction";

    // TODO: Find a better spot for these
    public static final int BLOCK_RED_WATER_EFFECT_DURATION_BASE = 5;
    public static final int BLOCK_RED_WATER_EFFECT_DURATION_MODIFIER = 2;
    public static final int BLOCK_RED_WATER_RANGE_BASE = 1;
    public static final int BLOCK_RED_WATER_RANGE_MODIFIER = 3;

}
