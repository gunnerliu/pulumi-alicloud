// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class ManagedKubernetesMaintenanceWindowArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedKubernetesMaintenanceWindowArgs Empty = new ManagedKubernetesMaintenanceWindowArgs();

    /**
     * The maintenance time, values range from 1 to 24,unit is hour. For example: &#34;3h&#34;.
     * 
     */
    @Import(name="duration", required=true)
    private Output<String> duration;

    /**
     * @return The maintenance time, values range from 1 to 24,unit is hour. For example: &#34;3h&#34;.
     * 
     */
    public Output<String> duration() {
        return this.duration;
    }

    /**
     * Whether to open the maintenance window. The following parameters take effect only `enable = true`.
     * 
     */
    @Import(name="enable", required=true)
    private Output<Boolean> enable;

    /**
     * @return Whether to open the maintenance window. The following parameters take effect only `enable = true`.
     * 
     */
    public Output<Boolean> enable() {
        return this.enable;
    }

    /**
     * Initial maintenance time, For example:&#34;03:00:00Z&#34;.
     * 
     */
    @Import(name="maintenanceTime", required=true)
    private Output<String> maintenanceTime;

    /**
     * @return Initial maintenance time, For example:&#34;03:00:00Z&#34;.
     * 
     */
    public Output<String> maintenanceTime() {
        return this.maintenanceTime;
    }

    /**
     * Maintenance cycle, you can set the values from Monday to Sunday, separated by commas when the values are multiple. The default is Thursday.
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
    @Import(name="weeklyPeriod", required=true)
    private Output<String> weeklyPeriod;

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
    public Output<String> weeklyPeriod() {
        return this.weeklyPeriod;
    }

    private ManagedKubernetesMaintenanceWindowArgs() {}

    private ManagedKubernetesMaintenanceWindowArgs(ManagedKubernetesMaintenanceWindowArgs $) {
        this.duration = $.duration;
        this.enable = $.enable;
        this.maintenanceTime = $.maintenanceTime;
        this.weeklyPeriod = $.weeklyPeriod;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedKubernetesMaintenanceWindowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedKubernetesMaintenanceWindowArgs $;

        public Builder() {
            $ = new ManagedKubernetesMaintenanceWindowArgs();
        }

        public Builder(ManagedKubernetesMaintenanceWindowArgs defaults) {
            $ = new ManagedKubernetesMaintenanceWindowArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param duration The maintenance time, values range from 1 to 24,unit is hour. For example: &#34;3h&#34;.
         * 
         * @return builder
         * 
         */
        public Builder duration(Output<String> duration) {
            $.duration = duration;
            return this;
        }

        /**
         * @param duration The maintenance time, values range from 1 to 24,unit is hour. For example: &#34;3h&#34;.
         * 
         * @return builder
         * 
         */
        public Builder duration(String duration) {
            return duration(Output.of(duration));
        }

        /**
         * @param enable Whether to open the maintenance window. The following parameters take effect only `enable = true`.
         * 
         * @return builder
         * 
         */
        public Builder enable(Output<Boolean> enable) {
            $.enable = enable;
            return this;
        }

        /**
         * @param enable Whether to open the maintenance window. The following parameters take effect only `enable = true`.
         * 
         * @return builder
         * 
         */
        public Builder enable(Boolean enable) {
            return enable(Output.of(enable));
        }

        /**
         * @param maintenanceTime Initial maintenance time, For example:&#34;03:00:00Z&#34;.
         * 
         * @return builder
         * 
         */
        public Builder maintenanceTime(Output<String> maintenanceTime) {
            $.maintenanceTime = maintenanceTime;
            return this;
        }

        /**
         * @param maintenanceTime Initial maintenance time, For example:&#34;03:00:00Z&#34;.
         * 
         * @return builder
         * 
         */
        public Builder maintenanceTime(String maintenanceTime) {
            return maintenanceTime(Output.of(maintenanceTime));
        }

        /**
         * @param weeklyPeriod Maintenance cycle, you can set the values from Monday to Sunday, separated by commas when the values are multiple. The default is Thursday.
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
         * @return builder
         * 
         */
        public Builder weeklyPeriod(Output<String> weeklyPeriod) {
            $.weeklyPeriod = weeklyPeriod;
            return this;
        }

        /**
         * @param weeklyPeriod Maintenance cycle, you can set the values from Monday to Sunday, separated by commas when the values are multiple. The default is Thursday.
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
         * @return builder
         * 
         */
        public Builder weeklyPeriod(String weeklyPeriod) {
            return weeklyPeriod(Output.of(weeklyPeriod));
        }

        public ManagedKubernetesMaintenanceWindowArgs build() {
            if ($.duration == null) {
                throw new MissingRequiredPropertyException("ManagedKubernetesMaintenanceWindowArgs", "duration");
            }
            if ($.enable == null) {
                throw new MissingRequiredPropertyException("ManagedKubernetesMaintenanceWindowArgs", "enable");
            }
            if ($.maintenanceTime == null) {
                throw new MissingRequiredPropertyException("ManagedKubernetesMaintenanceWindowArgs", "maintenanceTime");
            }
            if ($.weeklyPeriod == null) {
                throw new MissingRequiredPropertyException("ManagedKubernetesMaintenanceWindowArgs", "weeklyPeriod");
            }
            return $;
        }
    }

}
