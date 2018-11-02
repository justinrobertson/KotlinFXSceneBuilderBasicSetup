import javafx.application.Application
import javafx.stage.Stage

/*
 * New project, new Kotlin file/class.
 * File, Settings, Language and Frameworks, JavaFX -> set path to Scene Builder.
 * (In this case /opt/SceneBuilder/SceneBuilder)
 * Right-click on fxml file and click Open in Scene Builder (last option).
 *
 */

class KotlinFXSceneBuilderBasicSetup: Application() {
    override fun start(primaryStage: Stage?) {
        println("Starting...")
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            launch(KotlinFXSceneBuilderBasicSetup::class.java)
        }
    }
}