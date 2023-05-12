// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CS.Outputs
{

    [OutputType]
    public sealed class ManagedKubernetesMaintenanceWindow
    {
        /// <summary>
        /// The maintenance time, values range from 1 to 24,unit is hour. For example: "3h".
        /// </summary>
        public readonly string Duration;
        /// <summary>
        /// Whether to open the maintenance window. The following parameters take effect only `enable = true`.
        /// </summary>
        public readonly bool Enable;
        /// <summary>
        /// Initial maintenance time, For example:"03:00:00Z".
        /// </summary>
        public readonly string MaintenanceTime;
        /// <summary>
        /// Maintenance cycle, you can set the values from Monday to Sunday, separated by commas when the values are multiple. The default is Thursday.
        /// 
        /// for example:
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        /// });
        /// ```
        /// </summary>
        public readonly string WeeklyPeriod;

        [OutputConstructor]
        private ManagedKubernetesMaintenanceWindow(
            string duration,

            bool enable,

            string maintenanceTime,

            string weeklyPeriod)
        {
            Duration = duration;
            Enable = enable;
            MaintenanceTime = maintenanceTime;
            WeeklyPeriod = weeklyPeriod;
        }
    }
}
