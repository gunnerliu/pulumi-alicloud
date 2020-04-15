// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ess
{
    public partial class Schedule : Pulumi.CustomResource
    {
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        [Output("launchExpirationTime")]
        public Output<int?> LaunchExpirationTime { get; private set; } = null!;

        [Output("launchTime")]
        public Output<string> LaunchTime { get; private set; } = null!;

        [Output("recurrenceEndTime")]
        public Output<string> RecurrenceEndTime { get; private set; } = null!;

        [Output("recurrenceType")]
        public Output<string> RecurrenceType { get; private set; } = null!;

        [Output("recurrenceValue")]
        public Output<string> RecurrenceValue { get; private set; } = null!;

        [Output("scheduledAction")]
        public Output<string> ScheduledAction { get; private set; } = null!;

        [Output("scheduledTaskName")]
        public Output<string?> ScheduledTaskName { get; private set; } = null!;

        [Output("taskEnabled")]
        public Output<bool?> TaskEnabled { get; private set; } = null!;


        /// <summary>
        /// Create a Schedule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Schedule(string name, ScheduleArgs args, CustomResourceOptions? options = null)
            : base("alicloud:ess/schedule:Schedule", name, args ?? new ScheduleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Schedule(string name, Input<string> id, ScheduleState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:ess/schedule:Schedule", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Schedule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Schedule Get(string name, Input<string> id, ScheduleState? state = null, CustomResourceOptions? options = null)
        {
            return new Schedule(name, id, state, options);
        }
    }

    public sealed class ScheduleArgs : Pulumi.ResourceArgs
    {
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("launchExpirationTime")]
        public Input<int>? LaunchExpirationTime { get; set; }

        [Input("launchTime", required: true)]
        public Input<string> LaunchTime { get; set; } = null!;

        [Input("recurrenceEndTime")]
        public Input<string>? RecurrenceEndTime { get; set; }

        [Input("recurrenceType")]
        public Input<string>? RecurrenceType { get; set; }

        [Input("recurrenceValue")]
        public Input<string>? RecurrenceValue { get; set; }

        [Input("scheduledAction", required: true)]
        public Input<string> ScheduledAction { get; set; } = null!;

        [Input("scheduledTaskName")]
        public Input<string>? ScheduledTaskName { get; set; }

        [Input("taskEnabled")]
        public Input<bool>? TaskEnabled { get; set; }

        public ScheduleArgs()
        {
        }
    }

    public sealed class ScheduleState : Pulumi.ResourceArgs
    {
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("launchExpirationTime")]
        public Input<int>? LaunchExpirationTime { get; set; }

        [Input("launchTime")]
        public Input<string>? LaunchTime { get; set; }

        [Input("recurrenceEndTime")]
        public Input<string>? RecurrenceEndTime { get; set; }

        [Input("recurrenceType")]
        public Input<string>? RecurrenceType { get; set; }

        [Input("recurrenceValue")]
        public Input<string>? RecurrenceValue { get; set; }

        [Input("scheduledAction")]
        public Input<string>? ScheduledAction { get; set; }

        [Input("scheduledTaskName")]
        public Input<string>? ScheduledTaskName { get; set; }

        [Input("taskEnabled")]
        public Input<bool>? TaskEnabled { get; set; }

        public ScheduleState()
        {
        }
    }
}
