import ElytraBot.ElytraBotModule
import com.lambda.client.plugin.api.Plugin

internal object ExtraMovment: Plugin() {

    override fun onLoad() {
        // Load any modules, commands, or HUD elements here
        modules.add(ElytraBotModule)
        commands.add(ElytraBotCommand)

    }

    override fun onUnload() {}
}