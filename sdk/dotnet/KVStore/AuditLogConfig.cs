// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.KVStore
{
    /// <summary>
    /// Provides a Redis And Memcache (KVStore) Audit Log Config resource.
    /// 
    /// &gt; **NOTE:** Available in v1.130.0+.
    /// 
    /// ## Example Usage
    /// 
    /// Basic Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new AliCloud.KVStore.AuditLogConfig("example", new()
    ///     {
    ///         DbAudit = true,
    ///         InstanceId = "r-abc123455",
    ///         Retention = 1,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Redis And Memcache (KVStore) Audit Log Config can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:kvstore/auditLogConfig:AuditLogConfig example &lt;instance_id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:kvstore/auditLogConfig:AuditLogConfig")]
    public partial class AuditLogConfig : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Instance Creation Time.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// Indicates Whether to Enable the Audit Log.  Valid value: 
        /// * true: Default Value, Open.
        /// * false: Closed.
        /// </summary>
        [Output("dbAudit")]
        public Output<bool?> DbAudit { get; private set; } = null!;

        /// <summary>
        /// Instance ID, Call the Describeinstances Get.
        /// </summary>
        [Output("instanceId")]
        public Output<string> InstanceId { get; private set; } = null!;

        /// <summary>
        /// Audit Log Retention Period Value: 1~365.
        /// </summary>
        [Output("retention")]
        public Output<int?> Retention { get; private set; } = null!;

        /// <summary>
        /// The status of the resource.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;


        /// <summary>
        /// Create a AuditLogConfig resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AuditLogConfig(string name, AuditLogConfigArgs args, CustomResourceOptions? options = null)
            : base("alicloud:kvstore/auditLogConfig:AuditLogConfig", name, args ?? new AuditLogConfigArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AuditLogConfig(string name, Input<string> id, AuditLogConfigState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:kvstore/auditLogConfig:AuditLogConfig", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AuditLogConfig resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AuditLogConfig Get(string name, Input<string> id, AuditLogConfigState? state = null, CustomResourceOptions? options = null)
        {
            return new AuditLogConfig(name, id, state, options);
        }
    }

    public sealed class AuditLogConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates Whether to Enable the Audit Log.  Valid value: 
        /// * true: Default Value, Open.
        /// * false: Closed.
        /// </summary>
        [Input("dbAudit")]
        public Input<bool>? DbAudit { get; set; }

        /// <summary>
        /// Instance ID, Call the Describeinstances Get.
        /// </summary>
        [Input("instanceId", required: true)]
        public Input<string> InstanceId { get; set; } = null!;

        /// <summary>
        /// Audit Log Retention Period Value: 1~365.
        /// </summary>
        [Input("retention")]
        public Input<int>? Retention { get; set; }

        public AuditLogConfigArgs()
        {
        }
        public static new AuditLogConfigArgs Empty => new AuditLogConfigArgs();
    }

    public sealed class AuditLogConfigState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Instance Creation Time.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// Indicates Whether to Enable the Audit Log.  Valid value: 
        /// * true: Default Value, Open.
        /// * false: Closed.
        /// </summary>
        [Input("dbAudit")]
        public Input<bool>? DbAudit { get; set; }

        /// <summary>
        /// Instance ID, Call the Describeinstances Get.
        /// </summary>
        [Input("instanceId")]
        public Input<string>? InstanceId { get; set; }

        /// <summary>
        /// Audit Log Retention Period Value: 1~365.
        /// </summary>
        [Input("retention")]
        public Input<int>? Retention { get; set; }

        /// <summary>
        /// The status of the resource.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public AuditLogConfigState()
        {
        }
        public static new AuditLogConfigState Empty => new AuditLogConfigState();
    }
}
