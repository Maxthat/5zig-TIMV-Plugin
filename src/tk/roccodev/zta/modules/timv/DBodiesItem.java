package tk.roccodev.zta.modules.timv;

import eu.the5zig.mod.The5zigAPI;
import eu.the5zig.mod.modules.GameModeItem;
import eu.the5zig.mod.render.RenderLocation;
import eu.the5zig.mod.server.GameState;
import tk.roccodev.zta.games.TIMV;
import tk.roccodev.zta.hiveapi.HiveAPI;

public class DBodiesItem extends GameModeItem<TIMV> {

	public DBodiesItem(){
		super(TIMV.class);
	}

	@Override
	protected Object getValue(boolean dummy) {
		
		return TIMV.detectivesDiscovered + "/" + TIMV.detectivesBefore + " Detectives";
		
	}

	@Override
	public String getName() {
		return "Discovered";
	}
	
	
	
	@Override
	public boolean shouldRender(boolean dummy){
		try{
			if(!(getGameMode() instanceof TIMV)) return false;
		return dummy || (getGameMode().getState() == GameState.GAME && TIMV.detectivesDiscovered != 0);
		}catch(Exception e){
			return false;
		}
	}

}
