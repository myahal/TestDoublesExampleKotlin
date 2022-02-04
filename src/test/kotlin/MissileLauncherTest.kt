import org.junit.Test
import org.junit.Assert.assertFalse

internal class MissileLauncherTest {
    @Test
    fun givenExpiredLaunchCode_MissileIsNotLaunched() {
        val missileSpy = SpyMissile()

        MissileLauncher.launchMissile(missileSpy, StubLaunchCode())

        assertFalse(missileSpy.launchWasCalled)
    }
}