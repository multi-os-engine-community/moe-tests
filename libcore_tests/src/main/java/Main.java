import ios.NSObject;
import ios.foundation.NSDictionary;
import ios.uikit.UIAlertView;
import ios.uikit.UIApplication;
import ios.uikit.UIScreen;
import ios.uikit.UIViewController;
import ios.uikit.UIWindow;
import ios.uikit.c.UIKit;
import ios.uikit.protocol.UIApplicationDelegate;

import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

public class Main extends NSObject implements UIApplicationDelegate {

    public static void main(String[] args) {
        UIKit.UIApplicationMain(0, null, null, Main.class.getName());
    }

	@Generated("NatJ")
	public static native Main alloc();

	@Generated("NatJ")
	protected Main(Pointer peer) {
		super(peer);
	}

	private UIWindow window;

	@Override
	public boolean applicationDidFinishLaunchingWithOptions(
			UIApplication application, NSDictionary launchOptions) {
		window = UIWindow.alloc().initWithFrame(UIScreen.mainScreen().bounds());

		UIViewController controller = UIViewController.alloc().init();
		window.setRootViewController(controller);

		window.makeKeyAndVisible();

		UIAlertView alert = UIAlertView.alloc().init();
		alert.setMessage("Hello MOE!");
		alert.show();

		return true;
	}

	@Override
	public void setWindow(UIWindow value) {
		window = value;
	}

	@Override
	public UIWindow window() {
		return window;
	}
}
