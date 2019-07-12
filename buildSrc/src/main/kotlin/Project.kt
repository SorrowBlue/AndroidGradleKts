import com.android.build.gradle.internal.dsl.BuildType
import org.gradle.api.NamedDomainObjectContainer

fun NamedDomainObjectContainer<BuildType>.release(body: BuildType.() -> Unit) {
    getByName("release") { body(this) }
}
