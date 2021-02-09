import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

/**
 * Tests all the system
 */
public class Main{
	public static void main(String[] args) {

		Store turkeyStore = new TurkeyStore();
		Store euStore = new EUStore();
		Store globalStore = new GlobalStore();
		System.out.println("______________________________________________________");
		Phone phone = turkeyStore.order("IflasDeluxe");
		System.out.println("IflasDeluxe (TR): \n");
		System.out.println("Camera: "+phone.camera.GetPixel()+" - "+phone.camera.GetType());
		System.out.println("Battery: "+phone.battery.GetAmper()+" - "+phone.battery.GetType());
		System.out.println("Case: "+phone.thecase.GetStrength()+" - "+phone.thecase.GetType());
		System.out.println("Cpu and Ram: "+phone.cpuram.GetCapacity()+" - "+phone.cpuram.GetType());
		System.out.println("Storage: "+phone.storage.GetSupport()+" - "+phone.storage.GetType());
		System.out.println("Display: "+phone.display.GetInches()+" - "+phone.display.GetType());
		System.out.println("______________________________________________________");
		phone = euStore.order("IflasDeluxe");
		System.out.println("IflasDeluxe (EU): \n");
		System.out.println("Camera: "+phone.camera.GetPixel()+" - "+phone.camera.GetType());
		System.out.println("Battery: "+phone.battery.GetAmper()+" - "+phone.battery.GetType());
		System.out.println("Case: "+phone.thecase.GetStrength()+" - "+phone.thecase.GetType());
		System.out.println("Cpu and Ram: "+phone.cpuram.GetCapacity()+" - "+phone.cpuram.GetType());
		System.out.println("Storage: "+phone.storage.GetSupport()+" - "+phone.storage.GetType());
		System.out.println("Display: "+phone.display.GetInches()+" - "+phone.display.GetType());

		System.out.println("______________________________________________________");

		phone = globalStore.order("IflasDeluxe");
		System.out.println("IflasDeluxe (GLOBAL): \n");
		System.out.println("Camera: "+phone.camera.GetPixel()+" - "+phone.camera.GetType());
		System.out.println("Battery: "+phone.battery.GetAmper()+" - "+phone.battery.GetType());
		System.out.println("Case: "+phone.thecase.GetStrength()+" - "+phone.thecase.GetType());
		System.out.println("Cpu and Ram: "+phone.cpuram.GetCapacity()+" - "+phone.cpuram.GetType());
		System.out.println("Storage: "+phone.storage.GetSupport()+" - "+phone.storage.GetType());
		System.out.println("Display: "+phone.display.GetInches()+" - "+phone.display.GetType());
		System.out.println("______________________________________________________");

		phone = turkeyStore.order("IIAmanIflas");
		System.out.println("IIAmanIflas (TR): \n");
		System.out.println("Camera: "+phone.camera.GetPixel()+" - "+phone.camera.GetType());
		System.out.println("Battery: "+phone.battery.GetAmper()+" - "+phone.battery.GetType());
		System.out.println("Case: "+phone.thecase.GetStrength()+" - "+phone.thecase.GetType());
		System.out.println("Cpu and Ram: "+phone.cpuram.GetCapacity()+" - "+phone.cpuram.GetType());
		System.out.println("Storage: "+phone.storage.GetSupport()+" - "+phone.storage.GetType());
		System.out.println("Display: "+phone.display.GetInches()+" - "+phone.display.GetType());

		System.out.println("______________________________________________________");
		phone = euStore.order("IIAmanIflas");
		System.out.println("IIAmanIflas (EU): \n");
		System.out.println("Camera: "+phone.camera.GetPixel()+" - "+phone.camera.GetType());
		System.out.println("Battery: "+phone.battery.GetAmper()+" - "+phone.battery.GetType());
		System.out.println("Case: "+phone.thecase.GetStrength()+" - "+phone.thecase.GetType());
		System.out.println("Cpu and Ram: "+phone.cpuram.GetCapacity()+" - "+phone.cpuram.GetType());
		System.out.println("Storage: "+phone.storage.GetSupport()+" - "+phone.storage.GetType());
		System.out.println("Display: "+phone.display.GetInches()+" - "+phone.display.GetType());
		System.out.println("______________________________________________________");
		phone = globalStore.order("IIAmanIflas");
		System.out.println("IIAmanIflas (GLOBAL): \n");
		System.out.println("Camera: "+phone.camera.GetPixel()+" - "+phone.camera.GetType());
		System.out.println("Battery: "+phone.battery.GetAmper()+" - "+phone.battery.GetType());
		System.out.println("Case: "+phone.thecase.GetStrength()+" - "+phone.thecase.GetType());
		System.out.println("Cpu and Ram: "+phone.cpuram.GetCapacity()+" - "+phone.cpuram.GetType());
		System.out.println("Storage: "+phone.storage.GetSupport()+" - "+phone.storage.GetType());
		System.out.println("Display: "+phone.display.GetInches()+" - "+phone.display.GetType());
		System.out.println("______________________________________________________");

		phone = turkeyStore.order("MaximumEffort");
		System.out.println("MaximumEffort (TR): \n");
		System.out.println("Camera: "+phone.camera.GetPixel()+" - "+phone.camera.GetType());
		System.out.println("Battery: "+phone.battery.GetAmper()+" - "+phone.battery.GetType());
		System.out.println("Case: "+phone.thecase.GetStrength()+" - "+phone.thecase.GetType());
		System.out.println("Cpu and Ram: "+phone.cpuram.GetCapacity()+" - "+phone.cpuram.GetType());
		System.out.println("Storage: "+phone.storage.GetSupport()+" - "+phone.storage.GetType());
		System.out.println("Display: "+phone.display.GetInches()+" - "+phone.display.GetType());
		System.out.println("______________________________________________________");
		phone = euStore.order("MaximumEffort");
		System.out.println("MaximumEffort (EU): \n");
		System.out.println("Camera: "+phone.camera.GetPixel()+" - "+phone.camera.GetType());
		System.out.println("Battery: "+phone.battery.GetAmper()+" - "+phone.battery.GetType());
		System.out.println("Case: "+phone.thecase.GetStrength()+" - "+phone.thecase.GetType());
		System.out.println("Cpu and Ram: "+phone.cpuram.GetCapacity()+" - "+phone.cpuram.GetType());
		System.out.println("Storage: "+phone.storage.GetSupport()+" - "+phone.storage.GetType());
		System.out.println("Display: "+phone.display.GetInches()+" - "+phone.display.GetType());
		System.out.println("______________________________________________________");
		phone = globalStore.order("MaximumEffort");
		System.out.println("MaximumEffort (GLOBAL): \n");
		System.out.println("Camera: "+phone.camera.GetPixel()+" - "+phone.camera.GetType());
		System.out.println("Battery: "+phone.battery.GetAmper()+" - "+phone.battery.GetType());
		System.out.println("Case: "+phone.thecase.GetStrength()+" - "+phone.thecase.GetType());
		System.out.println("Cpu and Ram: "+phone.cpuram.GetCapacity()+" - "+phone.cpuram.GetType());
		System.out.println("Storage: "+phone.storage.GetSupport()+" - "+phone.storage.GetType());
		System.out.println("Display: "+phone.display.GetInches()+" - "+phone.display.GetType());
		System.out.println("______________________________________________________");

	}
}
