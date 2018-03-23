package hugo.weaving.plugin

class HugoExtension {
    def enabled = true
    def tag = ""
    def threshold = 16

    def setEnabled(boolean enabled) {
        this.enabled = enabled
    }

    def getEnabled() {
        return enabled;
    }

    def setTag(String tag) {
        this.tag = tag + " - "
    }

    def getTag() {
        return tag
    }

    def setThreshold(int threshold) {
        this.threshold = threshold
    }

    def getThreshold() {
        return threshold
    }
}
