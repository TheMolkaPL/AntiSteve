package pl.filippop1.jebacnonpremium;

import java.util.logging.Level;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class JebacNonPremium extends JavaPlugin {
	@Override
	public void onEnable() {
		this.getLogger().log(Level.INFO, "#################");
		this.getLogger().log(Level.INFO, "# ANTY STEVE ON #");
		this.getLogger().log(Level.INFO, "#################");
		if (!Bukkit.getOnlineMode()) {
			for (int i = 0; i < 69; i++) {
				this.getLogger().log(Level.INFO, "");
				this.getLogger().log(Level.INFO, "#########################################");
				this.getLogger().log(Level.INFO, "#             NON PREMIUM!?             #");
				this.getLogger().log(Level.INFO, "#########################################");
				this.getLogger().log(Level.INFO, "#         WYLACZAM SERWER KURWA!        #");
				this.getLogger().log(Level.INFO, "#             Buy Minecraft!:           #");
				this.getLogger().log(Level.INFO, "# https://minecraft.net/store/minecraft #");
				this.getLogger().log(Level.INFO, "#########################################");
			}
			this.getServer().shutdown();
		}
	}
	
	@Override
	public void onDisable() {
		this.getLogger().log(Level.INFO, "##################");
		this.getLogger().log(Level.INFO, "# ANTY STEVE OFF #");
		this.getLogger().log(Level.INFO, "##################");
	}
}
