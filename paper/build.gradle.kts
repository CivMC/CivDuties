plugins {
	`java-library`
	id("net.civmc.civgradle.plugin")
	id("io.papermc.paperweight.userdev") version "1.3.1"
	id("com.github.johnrengelman.shadow") version "7.1.0"
}

civGradle {
	paper {
		pluginName = "CivDuties"
	}
}

dependencies {
	paperDevBundle("1.19.4-R0.1-SNAPSHOT")

    compileOnly("net.civmc.civmodcore:paper:2.0.0-SNAPSHOT:dev-all")
    compileOnly("com.github.MilkBowl:VaultAPI:1.7")
    compileOnly("net.civmc.combattagplus:paper:2.0.0-SNAPSHOT:dev")
}