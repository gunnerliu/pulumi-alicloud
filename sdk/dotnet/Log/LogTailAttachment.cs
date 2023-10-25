// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Log
{
    /// <summary>
    /// The Logtail access service is a log collection agent provided by Log Service.
    /// You can use Logtail to collect logs from servers such as Alibaba Cloud Elastic
    /// Compute Service (ECS) instances in real time in the Log Service console. [Refer to details](https://www.alibabacloud.com/help/doc-detail/29058.htm)
    /// 
    /// This resource amis to attach one logtail configure to a machine group.
    /// 
    /// &gt; **NOTE:** One logtail configure can be attached to multiple machine groups and one machine group can attach several logtail configures.
    /// 
    /// ## Import
    /// 
    /// Logtial to machine group can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:log/logTailAttachment:LogTailAttachment example tf-log:tf-log-config:tf-log-machine-group
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:log/logTailAttachment:LogTailAttachment")]
    public partial class LogTailAttachment : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The Logtail configuration name, which is unique in the same project.
        /// </summary>
        [Output("logtailConfigName")]
        public Output<string> LogtailConfigName { get; private set; } = null!;

        /// <summary>
        /// The machine group name, which is unique in the same project.
        /// </summary>
        [Output("machineGroupName")]
        public Output<string> MachineGroupName { get; private set; } = null!;

        /// <summary>
        /// The project name to the log store belongs.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;


        /// <summary>
        /// Create a LogTailAttachment resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public LogTailAttachment(string name, LogTailAttachmentArgs args, CustomResourceOptions? options = null)
            : base("alicloud:log/logTailAttachment:LogTailAttachment", name, args ?? new LogTailAttachmentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private LogTailAttachment(string name, Input<string> id, LogTailAttachmentState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:log/logTailAttachment:LogTailAttachment", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing LogTailAttachment resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static LogTailAttachment Get(string name, Input<string> id, LogTailAttachmentState? state = null, CustomResourceOptions? options = null)
        {
            return new LogTailAttachment(name, id, state, options);
        }
    }

    public sealed class LogTailAttachmentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Logtail configuration name, which is unique in the same project.
        /// </summary>
        [Input("logtailConfigName", required: true)]
        public Input<string> LogtailConfigName { get; set; } = null!;

        /// <summary>
        /// The machine group name, which is unique in the same project.
        /// </summary>
        [Input("machineGroupName", required: true)]
        public Input<string> MachineGroupName { get; set; } = null!;

        /// <summary>
        /// The project name to the log store belongs.
        /// </summary>
        [Input("project", required: true)]
        public Input<string> Project { get; set; } = null!;

        public LogTailAttachmentArgs()
        {
        }
        public static new LogTailAttachmentArgs Empty => new LogTailAttachmentArgs();
    }

    public sealed class LogTailAttachmentState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Logtail configuration name, which is unique in the same project.
        /// </summary>
        [Input("logtailConfigName")]
        public Input<string>? LogtailConfigName { get; set; }

        /// <summary>
        /// The machine group name, which is unique in the same project.
        /// </summary>
        [Input("machineGroupName")]
        public Input<string>? MachineGroupName { get; set; }

        /// <summary>
        /// The project name to the log store belongs.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        public LogTailAttachmentState()
        {
        }
        public static new LogTailAttachmentState Empty => new LogTailAttachmentState();
    }
}
