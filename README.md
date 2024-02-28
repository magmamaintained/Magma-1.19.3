# Archived
<div align="center">
<img src="https://i.imgur.com/zTCTCWG.png" alt="Magma logo" align="middle"></img>

[![](https://img.shields.io/badge/Minecraft%20Forge-1.19.3%20--%2044.1.23%20--%201f44339d-orange.svg)](https://files.minecraftforge.net/net/minecraftforge/forge/index_1.19.3.html)
[![](https://img.shields.io/badge/Bukkit-1.19%20r2-blue)](https://hub.spigotmc.org/stash/projects/SPIGOT/repos/bukkit/browse)
[![](https://img.shields.io/badge/CraftBukkit-Build%20c810c3ed878-orange)](https://hub.spigotmc.org/stash/projects/SPIGOT/repos/craftbukkit/browse?at=refs%2Fheads%2Fversion%2F1.19.3)
[![](https://img.shields.io/badge/Spigot-Build%20NA-yellow)](https://hub.spigotmc.org/stash/projects/SPIGOT/repos/spigot/browse)
[![](https://img.shields.io/discord/1175785262475923556.svg?logo=discord&logoWidth=18&colorB=7289DA)](https://discord.gg/STZjCzRZn9)
</div>

## ❓ About

Magma is the next generation of hybrid minecraft server softwares.

Magma is based on **Forge and Paper**, meaning it can run both **Craftbukkit/Spigot/Paper plugins and Forge mods**.

We hope to eliminate all issues with craftbukkit forge servers. In the end, we envision a seamless, low lag Magma experience with support for newer 1.12+ versions of Minecraft.

## 🌐 BungeeCord/Velocity

Magma 1.19.3 is **not** compatible with [Velocity](https://velocitypowered.com/downloads) or any [BungeeCord](https://github.com/SpigotMC/BungeeCord) fork.

This is **caused by Forge** and not a fault of Magma. We cannot fix this ourselves without modifying the client.

You might be able to use the Waterfall fork called [Lightfall](https://github.com/ArclightPowered/lightfall), but it requires a clientside-mod in order to work.

## 🧪 Other versions

- For 1.20.2 use [Ketting](https://github.com/kettingpowered)
- For 1.20.1 [here](https://github.com/magmamaintained/Magma-1.20.1)
- For 1.18.2 [here](https://github.com/magmamaintained/Magma-1.18.2)
- For 1.12.2 [here](https://github.com/magmamaintained/Magma-1.12.2)

## 🪣 Deployment

### Installation

1. Download the latest builds from the [**Releases** section](https://github.com/magmamaintained/Magma-1.19.3/releases/latest) (**Download** the one that ends in server) 
2. Make a new directory(folder) for the server
3. Move the jar that you downloaded into the new directory
4. Run the jar with your command prompt or terminal, going to your directory and entering `java -jar Magma-[version]-server.jar`. Change [version] to your Magma version.

**NOTE** - Magma does NOT have a gui, you cannot open the server jar directly by double clicking it!

### Building the sources

- Clone the Project
    - You can use Git GUI (like GitHub Desktop/GitKraken) or clone using the terminal using:
        - `git clone https://github.com/magmamaintained/Magma-1.19.3.git`
- Building
    - First you want to run the build command
        - `./gradlew setup magmaJar`
    - Now go and get a drink this may take some time
    - Navigate to `projects/magma/build/libs` directory of the compiled source code
    - Copy the Jar to a new server directory (see Installation)
    
## ⚙️ Contributing

If you wish to inspect Magma, submit PRs, or otherwise work with Magma itself, you're in the right place!.

Please read the [CONTRIBUTING.md](https://git.magmafoundation.org/magmafoundation/Magma-1-19-x/-/blob/1.19.x/CONTRIBUTING.md) to see how to contribute, setup, and run.

## 💬 Chat

You are welcome to visit Magma's Discord server [here](https://discord.gg/STZjCzRZn9).
