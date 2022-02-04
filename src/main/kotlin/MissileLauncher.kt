import java.lang.RuntimeException

interface Missile {
    fun launch(): Unit
}

interface LaunchCode {
    fun isExpired(): Boolean
}

class DummyMissile: Missile {
    override fun launch() {
        throw RuntimeException()
    }
}

class SpyMissile: Missile {
    var launchWasCalled = false

    override fun launch() {
        launchWasCalled = true
    }
}

class StubLaunchCode: LaunchCode {
    override fun isExpired(): Boolean {
        return true
    }
}


class MissileLauncher {
    companion object {
        fun launchMissile(missile: Missile,  launchCode: LaunchCode): Unit {
            if (!launchCode.isExpired()) {
                missile.launch()
            }
        }
    }
}