package io.anuke.mindustry.world.blocks;

import io.anuke.mindustry.graphics.Fx;
import io.anuke.mindustry.world.Block;
import io.anuke.mindustry.world.blocks.types.Wall;
import io.anuke.mindustry.world.blocks.types.defense.*;

public class DefenseBlocks{
	static final int WALL_HEALTH_MULTIPLIER = 5;
	
	public static final Block

	stonewall = new Wall("stonewall"){{
		health = 50 * WALL_HEALTH_MULTIPLIER;
	}},

	ironwall = new Wall("ironwall"){{
		health = 100 * WALL_HEALTH_MULTIPLIER;
	}},

	steelwall = new Wall("steelwall"){{
		health = 150 * WALL_HEALTH_MULTIPLIER;
	}},

	titaniumwall = new Wall("titaniumwall"){{
		health = 200 * WALL_HEALTH_MULTIPLIER;
	}},
	diriumwall = new Wall("duriumwall"){{
		health = 250 * WALL_HEALTH_MULTIPLIER;
	}},
	compositewall = new Wall("compositewall"){{
		health = 300 * WALL_HEALTH_MULTIPLIER;
	}},
	steelwalllarge = new Wall("steelwall-large"){{
		health = 150 * 4 * WALL_HEALTH_MULTIPLIER;
		width = height = 2;
	}},
	titaniumwalllarge = new Wall("titaniumwall-large"){{
		health = 200 * 4 * WALL_HEALTH_MULTIPLIER;
		width = height = 2;
	}},
	diriumwalllarge = new Wall("duriumwall-large"){{
		health = 250 * 4 * WALL_HEALTH_MULTIPLIER;
		width = height = 2;
	}},
	titaniumshieldwall = new ShieldedWallBlock("titaniumshieldwall"){{
		health = 200 * WALL_HEALTH_MULTIPLIER;
	}},

	repairturret = new RepairTurret("repairturret"){
		{
			range = 25;
			reload = 20f;
			health = 50;
			powerUsed = 0.1f;
		}
	},

	megarepairturret = new RepairTurret("megarepairturret"){
		{
			range = 50;
      		reload = 10f;
			health = 100;
			powerUsed = 0.05f;
		}
	},

	shieldgenerator = new ShieldBlock("shieldgenerator"){
		{
			health = 150 * WALL_HEALTH_MULTIPLIER;
		}
	},
	door = new Door("door"){{
		health = 137 * WALL_HEALTH_MULTIPLIER;
	}},
	largedoor = new Door("door-large"){{
		openfx = Fx.dooropenlarge;
		closefx = Fx.doorcloselarge;
		health = 137 * 4 * WALL_HEALTH_MULTIPLIER;
		width = height = 2;
	}};
}
