package hugo.weaving.plugin

class HugoExtension {
    def enabled = true
    def tag = ""

    def setEnabled(boolean enabled) {
        this.enabled = enabled
    }

    def getEnabled() {
        return enabled;
    }

    def setTag(String tag) {
        this.tag = tag
    }

    def getTag() {
        return tag
    }
}
