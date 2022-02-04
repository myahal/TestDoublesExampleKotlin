import org.junit.Test

internal class MissileLauncherTest {
    @Test
    fun givenExpiredLaunchCode_MissileIsNotLaunched() {
        MissileLauncher.launchMissile(DummyMissile(), StubLaunchCode())
    }
}