package live.einfachgustaf.punishments.utils

import net.kyori.adventure.text.Component

fun appendMessageToPrefix(message: Component): Component {
    return prefix.append(message)
}