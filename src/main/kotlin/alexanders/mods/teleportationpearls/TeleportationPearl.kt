package alexanders.mods.teleportationpearls

import de.ellpeck.rockbottom.api.RockBottomAPI
import de.ellpeck.rockbottom.api.assets.IAssetManager
import de.ellpeck.rockbottom.api.item.ItemBasic
import de.ellpeck.rockbottom.api.item.ItemInstance
import de.ellpeck.rockbottom.api.util.reg.IResourceName


open class TeleportationPearl(resource : IResourceName) : ItemBasic(resource) {
    private val descriptionLocation = RockBottomAPI.createRes(instance, "desc")
    override fun describeItem(manager: IAssetManager, instance: ItemInstance, desc: MutableList<String>, isAdvanced: Boolean) {
        super.describeItem(manager, instance, desc, isAdvanced)
        desc.add(manager.localize(descriptionLocation))
    }
}
