// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ess
{
    /// <summary>
    /// Suspend/Resume processes to a specified scaling group.
    /// 
    /// For information about scaling group suspend process, see [SuspendProcesses](https://www.alibabacloud.com/help/en/auto-scaling/latest/suspendprocesses).
    /// 
    /// &gt; NOTE: Available in v1.166.0+
    /// 
    /// ## Import
    /// 
    /// ### Timeouts The `timeouts` block allows you to specify [timeouts](https://www.terraform.io/docs/configuration-0-11/resources.html#timeouts) for certain actions* `create` - (Defaults to 1 mins) Used when create the process. * `delete` - (Defaults to 1 mins) Used when delete the process.
    /// </summary>
    [AliCloudResourceType("alicloud:ess/suspendProcess:SuspendProcess")]
    public partial class SuspendProcess : Pulumi.CustomResource
    {
        /// <summary>
        /// Activity type N that you want to suspend. Valid values are: `SCALE_OUT`,`SCALE_IN`,`HealthCheck`,`AlarmNotification` and `ScheduledAction`.
        /// </summary>
        [Output("process")]
        public Output<string> Process { get; private set; } = null!;

        /// <summary>
        /// ID of the scaling group.
        /// </summary>
        [Output("scalingGroupId")]
        public Output<string> ScalingGroupId { get; private set; } = null!;


        /// <summary>
        /// Create a SuspendProcess resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SuspendProcess(string name, SuspendProcessArgs args, CustomResourceOptions? options = null)
            : base("alicloud:ess/suspendProcess:SuspendProcess", name, args ?? new SuspendProcessArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SuspendProcess(string name, Input<string> id, SuspendProcessState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:ess/suspendProcess:SuspendProcess", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing SuspendProcess resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SuspendProcess Get(string name, Input<string> id, SuspendProcessState? state = null, CustomResourceOptions? options = null)
        {
            return new SuspendProcess(name, id, state, options);
        }
    }

    public sealed class SuspendProcessArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Activity type N that you want to suspend. Valid values are: `SCALE_OUT`,`SCALE_IN`,`HealthCheck`,`AlarmNotification` and `ScheduledAction`.
        /// </summary>
        [Input("process", required: true)]
        public Input<string> Process { get; set; } = null!;

        /// <summary>
        /// ID of the scaling group.
        /// </summary>
        [Input("scalingGroupId", required: true)]
        public Input<string> ScalingGroupId { get; set; } = null!;

        public SuspendProcessArgs()
        {
        }
    }

    public sealed class SuspendProcessState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Activity type N that you want to suspend. Valid values are: `SCALE_OUT`,`SCALE_IN`,`HealthCheck`,`AlarmNotification` and `ScheduledAction`.
        /// </summary>
        [Input("process")]
        public Input<string>? Process { get; set; }

        /// <summary>
        /// ID of the scaling group.
        /// </summary>
        [Input("scalingGroupId")]
        public Input<string>? ScalingGroupId { get; set; }

        public SuspendProcessState()
        {
        }
    }
}
