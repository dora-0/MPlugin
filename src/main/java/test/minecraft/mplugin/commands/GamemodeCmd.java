package test.minecraft.mplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class GamemodeCmd implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {
        if (args.length > 1) {
            return false;
        }

        if (sender.isOp()) {
            Player player = (Player) sender;
            switch (args[0]) {
                case "0":
                    player.setGameMode(GameMode.SURVIVAL);
                    sender.sendMessage(ChatColor.GREEN + "Your gamemode is Changed to SURVIVAL");
                    break;
                case "1":
                    player.setGameMode(GameMode.CREATIVE);
                    sender.sendMessage(ChatColor.GREEN + "Your gamemode is Changed to CREATIVE");
                    break;
                case "2":
                    player.setGameMode(GameMode.ADVENTURE);
                    sender.sendMessage(ChatColor.GREEN + "Your gamemode is Changed to ADVENTURE");
                    break;
                case "3":
                    player.setGameMode(GameMode.SPECTATOR);
                    sender.sendMessage(ChatColor.GREEN + "Your gamemode is Changed to SPECTATOR");

                    break;
                default:
                    sender.sendMessage(ChatColor.RED + "Usage: /gm (0, 1, 2, 3)\n 0 : Survival\n 1 : Creative \n 2 : Spectator \n 3 : Adventure");
            }
        } else {
            sender.sendMessage("You don't have Permission");
        }
        return true;
    }
}
