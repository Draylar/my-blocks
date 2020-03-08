package draylar.myblocks;

import me.sargunvohra.mcmods.autoconfig1u.ConfigData;
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config;

import java.util.ArrayList;
import java.util.List;

@Config(name = "myblocks")
public class MyBlocksConfig implements ConfigData {
    List<String> blocks = new ArrayList<>();
}
