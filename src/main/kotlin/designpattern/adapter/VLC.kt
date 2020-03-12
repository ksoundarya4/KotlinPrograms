package designpattern.adapter

class VLC : MediaPackage {

    /**
     * Function to play using VlC media.
     *
     * @param fileName to play
     */
    override fun playFile(fileName: String) {
        println("Playing VLC file $fileName")
    }
}