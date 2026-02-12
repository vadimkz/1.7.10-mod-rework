MAGICAL CROPS – RESTORED & AUTOMATED (Minecraft 1.7.10)

====================================================

SUMMARY OF CHANGES
------------------

✔ Restored decompiled Magical Crops source code  
✔ Added right-click harvesting with plant regrowth  
✔ Disabled legacy left-click harvest logic  
✔ Implemented magical farmland behavior (always hydrated, protected, growth boost)  
✔ Added MineFactory Reloaded harvester compatibility  
✔ Fixed broken registrations after MCP remapping  
✔ Replaced broken custom creative tab  
✔ Rebuilt using modern ForgeGradle (anatawa)  

Compatible with:
MineFactory Reloaded 2.8.2B1-201 (Minecraft 1.7.10)

====================================================


PROJECT BACKGROUND
------------------

I originally downloaded a Minecraft 1.7.10 modpack that included the Magical Crops mod.

While progressing through the pack, I noticed that this version of Magical Crops had no 
right-click harvesting feature. At first it didn’t bother me much.

However, the modpack also included Avaritia — a mod that requires hundreds of thousands 
of resources for progression.

After analyzing the pack, I realized that the only realistic way to progress in Avaritia 
was through building and automating Magical Crops farms.

Unfortunately, none of the many automation mods in the pack were able to properly harvest 
Magical Crops.

I had previously played newer Minecraft versions where crops could be automatically harvested 
using the MineFactory Reloaded Harvester — which worked perfectly.

But in this 1.7.10 environment, it didn’t work at all.

So I decided to fix it myself — with zero Java knowledge.

My helpers during this journey were ChatGPT and Gemini.


====================================================


SOURCE CODE RESTORATION
-----------------------

One of the hardest parts was restoring the decompiled Magical Crops source code.

The original mod was heavily obfuscated and broken after decompilation.

Fixing:
- method mappings
- field mappings
- registrations
- broken logic

took me about two weeks (lol).


====================================================


GAMEPLAY CHANGES
----------------

After cleaning and restoring the code, I implemented the following:


RIGHT-CLICK HARVESTING
---------------------

• Crops can now be harvested with right-click  
• The plant automatically resets to growth stage 0  
• 100% seed drop chance (original balance was lost during refactor, but I prefer it this way)

The old left-click harvesting class was fully disabled.


MAGICAL FARMLAND LOGIC
---------------------

Accio, Crucio and other Magical Crops farmlands now:

✔ Are always hydrated  
✔ Cannot be trampled  
✔ Increase crop growth speed (Magical Crops only)

They finally feel truly magical 😄


====================================================


MINEFACTORY RELOADED COMPATIBILITY
---------------------------------

Full automation support was added:

• All Magical Crops are registered as harvestable plants  
• MFR Harvester collects crops at full growth  
• Plants are not broken — growth resets after harvest  

Tested and compatible with:

MineFactory Reloaded 2.8.2B1-201


====================================================


TECHNICAL NOTES
---------------

• Fixed broken item/block registrations after MCP remapping  
• Replaced broken custom creative tab to prevent client crashes  
• Integrated MFR using postInit registration (correct for 1.7.10 API)  
• Built using anatawa’s ForgeGradle environment 
// ForgeGradle files in this repository are incorrect. antawa's version used local. You can use /src only and download clean anatawa's ForgeGradle
// Also you need MFR to rebuilld this mod
• Java 8 compatible  


====================================================


FINAL RESULT
------------

Magical Crops is now:

✔ Fully functional  
✔ Automatable  
✔ Balanced for large-scale resource farming  
✔ Playable in heavy progression modpacks  

Perfect for Avaritia-style late game setups.


====================================================

Enjoy farming 🌱
