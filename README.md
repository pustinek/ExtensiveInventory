
# ExtensiveInventory (SmartInventory Fork)
Advanced Inventory API for your Minecraft Bukkit plugins.
Created to be used inside my own plugins.

Difference between this and SmartInventory:
- Added some small ease of use features
- Changed that every inventory event in passed down, so you can create inventories where your drag/drop items inside the inventory
- Deprecated the .listener() on inventory builder in favor of the interface


**You can use this as a Plugin, or use it as a library** (see [the docs](https://minuskube.gitbook.io/smartinvs/))

## Features
* Inventories of any type (workbench, chest, furnace, ...)
* Customizable size when possible (chest, ...)
* Custom titles
* Allows to prevent the player from closing its inventory
* Custom listeners for the event related to the inventory
* Iterator for inventory slots
* Page system
* Util methods to fill an inventory's row/column/borders/...
* Actions when player clicks on an item
* Update methods to edit the content of the inventory every tick

## Docs
[Click here to read the docs on Gitbook](https://minuskube.gitbook.io/smartinvs/)

## Usage
To use the SmartInvs API, either:
- Put it in the `plugins` folder of your server, add it to your dependencies in your plugin.yml (e.g. `depend: [ExtensiveInventory]`) and add it to the dependencies in your IDE.
- Put it inside your plugin jar, initialize an `InventoryManager` in your plugin (don't forget to call the `init()` method), and add a `.manager(invManager)` to your SmartInventory Builders.

You can download the latest version on the [Releases page](https://github.com/MinusKube/SmartInvs/releases) on Github.

You can also use a build system:
### Gradle
```gradle
repositories {
    mavenCentral()
}

dependencies {
    compile 'fr.minuskube.inv:smart-invs:1.2.7'
}
```

### Maven
```xml
<dependency>
  <groupId>fr.minuskube.inv</groupId>
  <artifactId>smart-invs</artifactId>
  <version>1.2.7</version>
</dependency>
```

## TODO
* Add some Javadocs

## Issues
If you have a problem with the API, or you want to request a feature, make an issue [here](https://github.com/MinusKube/SmartInvs/issues).
