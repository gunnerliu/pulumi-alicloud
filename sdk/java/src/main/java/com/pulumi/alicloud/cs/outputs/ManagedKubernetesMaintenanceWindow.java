// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ManagedKubernetesMaintenanceWindow {
    /**
     * @return The maintenance time, values range from 1 to 24,unit is hour. For example: &#34;3h&#34;.
     * 
     */
    private final String duration;
    /**
     * @return Whether to open the maintenance window. The following parameters take effect only `enable = true`.
     * 
     */
    private final Boolean enable;
    /**
     * @return Initial maintenance time, For example:&#34;03:00:00Z&#34;.
     * 
     */
    private final String maintenanceTime;
    /**
     * @return Maintenance cycle, you can set the values from Monday to Sunday, separated by commas when the values are multiple. The default is Thursday.
     * 
     * for example:
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *     }
     * }
     * ```
     * 
     */
    private final String weeklyPeriod;

    @CustomType.Constructor
    private ManagedKubernetesMaintenanceWindow(
        @CustomType.Parameter("duration") String duration,
        @CustomType.Parameter("enable") Boolean enable,
        @CustomType.Parameter("maintenanceTime") String maintenanceTime,
        @CustomType.Parameter("weeklyPeriod") String weeklyPeriod) {
        this.duration = duration;
        this.enable = enable;
        this.maintenanceTime = maintenanceTime;
        this.weeklyPeriod = weeklyPeriod;
    }

    /**
     * @return The maintenance time, values range from 1 to 24,unit is hour. For example: &#34;3h&#34;.
     * 
     */
    public String duration() {
        return this.duration;
    }
    /**
     * @return Whether to open the maintenance window. The following parameters take effect only `enable = true`.
     * 
     */
    public Boolean enable() {
        return this.enable;
    }
    /**
     * @return Initial maintenance time, For example:&#34;03:00:00Z&#34;.
     * 
     */
    public String maintenanceTime() {
        return this.maintenanceTime;
    }
    /**
     * @return Maintenance cycle, you can set the values from Monday to Sunday, separated by commas when the values are multiple. The default is Thursday.
     * 
     * for example:
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *     }
     * }
     * ```
     * 
     */
    public String weeklyPeriod() {
        return this.weeklyPeriod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedKubernetesMaintenanceWindow defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String duration;
        private Boolean enable;
        private String maintenanceTime;
        private String weeklyPeriod;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedKubernetesMaintenanceWindow defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
    	      this.enable = defaults.enable;
    	      this.maintenanceTime = defaults.maintenanceTime;
    	      this.weeklyPeriod = defaults.weeklyPeriod;
        }

        public Builder duration(String duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }
        public Builder enable(Boolean enable) {
            this.enable = Objects.requireNonNull(enable);
            return this;
        }
        public Builder maintenanceTime(String maintenanceTime) {
            this.maintenanceTime = Objects.requireNonNull(maintenanceTime);
            return this;
        }
        public Builder weeklyPeriod(String weeklyPeriod) {
            this.weeklyPeriod = Objects.requireNonNull(weeklyPeriod);
            return this;
        }        public ManagedKubernetesMaintenanceWindow build() {
            return new ManagedKubernetesMaintenanceWindow(duration, enable, maintenanceTime, weeklyPeriod);
        }
    }
}
