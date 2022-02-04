import org.junit.Test
import org.junit.Assert.assertFalse

internal class MissileLauncherTest {
    @Test
    fun givenExpiredLaunchCode_MissileIsNotLaunched() {
        val missleSpy = SpyMissile()

        MissileLauncher.launchMissile(missleSpy, StubLaunchCode())

        assertFalse(missleSpy.launchWasCalled)
    }
}