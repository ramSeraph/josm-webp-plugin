package org.openstreetmap.josm.plugins.webp;

import java.util.logging.Logger;
import javax.imageio.ImageIO;
import org.openstreetmap.josm.plugins.Plugin;
import org.openstreetmap.josm.plugins.PluginInformation;

public class WebpPlugin extends Plugin {
  private static final Logger logger = Logger.getLogger(WebpPlugin.class.getName());
  /**
   * Will be invoked by JOSM to bootstrap the plugin
   *
   * @param info  information about the plugin and its local installation
   */
  public WebpPlugin(PluginInformation info) {
     super(info);
     ImageIO.scanForPlugins();
     String names[] = ImageIO.getReaderFormatNames();
     for (int i = 0; i < names.length; ++i) {
         logger.info("imageio reader: " + names[i]);
     }
  }
}
