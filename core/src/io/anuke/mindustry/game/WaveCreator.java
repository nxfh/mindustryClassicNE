package io.anuke.mindustry.game;

import com.badlogic.gdx.utils.Array;
import io.anuke.mindustry.entities.enemies.EnemyTypes;

public class WaveCreator{
    private static final int BOSS_WAVE = 14;
	
	public static Array<EnemySpawn> getSpawns(){

		return Array.with(
			new EnemySpawn(EnemyTypes.standard){{
				scaling = 1;
				before = 3;
			}},
			
			new EnemySpawn(EnemyTypes.fast){{
				scaling = 1;
				after = 3;
				spacing = 5;
				amount = 3;
				tierscaleback = 0;
				absoluteMax = 150;
			}},
			
			new EnemySpawn(EnemyTypes.blast){{
				after = 4;
				amount = 2;
				spacing = 5;
				scaling = 2;
				tierscaleback = 1;
			}},
			
			new EnemySpawn(EnemyTypes.tank){{
				after = 5;
				spacing = 5;
				scaling = 2;
				amount = 2;
			}},
			
			new EnemySpawn(EnemyTypes.rapid){{
				after = 7;
				spacing = 5;
				scaling = 2;
				amount = 3;
			}},
			
			new EnemySpawn(EnemyTypes.healer){{
				after = 5;
				spacing = 5;
				scaling = 1;
				amount = 1;
				absoluteMax = 150;
			}},
			
			new EnemySpawn(EnemyTypes.standard){{
				scaling = 3;
				after = 8;
				spacing = 4;
				tier = 2;
			}},
			
			new EnemySpawn(EnemyTypes.titan){{
				after = 6;
				amount = 2;
				spacing = 5;
				scaling = 3;
			}},
			
			new EnemySpawn(EnemyTypes.flamer){{
				after = 12;
				amount = 2;
				spacing = 5;
				scaling = 3;
			}},
			
			new EnemySpawn(EnemyTypes.emp){{
				after = 13;
				amount = 1;
				spacing = 5;
				scaling = 2;
				absoluteMax = 50;
			}},
			
			new EnemySpawn(EnemyTypes.blast){{
				after = 12;
				amount = 3;
				spacing = 5;
				scaling = 2;
				tierscaleback = 0;
			}},
			//boss wave
			new EnemySpawn(EnemyTypes.fortress){{
				after = BOSS_WAVE;
				amount = 1;
				spacing = 5;
				scaling = 1;
				absoluteMax = 50;
			}},
			
			new EnemySpawn(EnemyTypes.titan){{
				after = BOSS_WAVE;
				amount = 1;
				spacing = 5;
				scaling = 3;
				tierscaleback = 0;
			}},
			
			new EnemySpawn(EnemyTypes.healer){{
				after = BOSS_WAVE;
				spacing = 5;
				scaling = 2;
				amount = 2;
				absoluteMax = 150;
			}},
			//end boss wave
			
			//enchanced boss wave
			new EnemySpawn(EnemyTypes.mortar){{
				after = BOSS_WAVE + 5;
				amount = 1;
				spacing = 5;
				scaling = 3;
				absoluteMax = 50;
			}},
			
			new EnemySpawn(EnemyTypes.emp){{
				after = BOSS_WAVE + 5;
				amount = 1;
				spacing = 5;
				scaling = 3;
				absoluteMax = 50;
			}}
			//end enchanced boss wave
		);
	}
}
