package fr.areku.Authenticator;

import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public interface OfflineModePluginAuthenticator {
	public String getName();
	public boolean isPlayerLoggedIn(Player player);
	public void initialize(Plugin p);
	public String getRecommendedVersion();
}
