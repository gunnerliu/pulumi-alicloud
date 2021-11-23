// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Edas
{
    /// <summary>
    /// Binds SLB to an EDAS application.
    /// 
    /// &gt; **NOTE:** Available in 1.82.0+
    /// 
    /// ## Example Usage
    /// 
    /// Basic Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var @default = new AliCloud.Edas.SlbAttachment("default", new AliCloud.Edas.SlbAttachmentArgs
    ///         {
    ///             AppId = @var.App_id,
    ///             SlbId = @var.Slb_id,
    ///             SlbIp = @var.Slb_ip,
    ///             Type = @var.Type,
    ///             ListenerPort = @var.Listener_port,
    ///             VserverGroupId = @var.Vserver_group_id,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:edas/slbAttachment:SlbAttachment")]
    public partial class SlbAttachment : Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the application to which you want to bind an SLB instance.
        /// </summary>
        [Output("appId")]
        public Output<string> AppId { get; private set; } = null!;

        /// <summary>
        /// The listening port for the bound SLB instance.
        /// </summary>
        [Output("listenerPort")]
        public Output<int?> ListenerPort { get; private set; } = null!;

        /// <summary>
        /// The ID of the SLB instance that is going to be bound.
        /// </summary>
        [Output("slbId")]
        public Output<string> SlbId { get; private set; } = null!;

        /// <summary>
        /// The IP address that is allocated to the bound SLB instance.
        /// </summary>
        [Output("slbIp")]
        public Output<string> SlbIp { get; private set; } = null!;

        /// <summary>
        /// Running Status of SLB instance. Inactive：The instance is stopped, and listener will not monitor and forward traffic. Active：The instance is running. After the instance is created, the default state is active. Locked：The instance is locked, the instance has been owed or locked by Alibaba Cloud. Expired: The instance has expired.
        /// </summary>
        [Output("slbStatus")]
        public Output<string> SlbStatus { get; private set; } = null!;

        /// <summary>
        /// The type of the bound SLB instance.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// The ID of the virtual server (VServer) group associated with the intranet SLB instance.
        /// </summary>
        [Output("vserverGroupId")]
        public Output<string?> VserverGroupId { get; private set; } = null!;

        /// <summary>
        /// VPC related vswitch ID.
        /// </summary>
        [Output("vswitchId")]
        public Output<string> VswitchId { get; private set; } = null!;


        /// <summary>
        /// Create a SlbAttachment resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SlbAttachment(string name, SlbAttachmentArgs args, CustomResourceOptions? options = null)
            : base("alicloud:edas/slbAttachment:SlbAttachment", name, args ?? new SlbAttachmentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SlbAttachment(string name, Input<string> id, SlbAttachmentState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:edas/slbAttachment:SlbAttachment", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SlbAttachment resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SlbAttachment Get(string name, Input<string> id, SlbAttachmentState? state = null, CustomResourceOptions? options = null)
        {
            return new SlbAttachment(name, id, state, options);
        }
    }

    public sealed class SlbAttachmentArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the application to which you want to bind an SLB instance.
        /// </summary>
        [Input("appId", required: true)]
        public Input<string> AppId { get; set; } = null!;

        /// <summary>
        /// The listening port for the bound SLB instance.
        /// </summary>
        [Input("listenerPort")]
        public Input<int>? ListenerPort { get; set; }

        /// <summary>
        /// The ID of the SLB instance that is going to be bound.
        /// </summary>
        [Input("slbId", required: true)]
        public Input<string> SlbId { get; set; } = null!;

        /// <summary>
        /// The IP address that is allocated to the bound SLB instance.
        /// </summary>
        [Input("slbIp", required: true)]
        public Input<string> SlbIp { get; set; } = null!;

        /// <summary>
        /// The type of the bound SLB instance.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// The ID of the virtual server (VServer) group associated with the intranet SLB instance.
        /// </summary>
        [Input("vserverGroupId")]
        public Input<string>? VserverGroupId { get; set; }

        public SlbAttachmentArgs()
        {
        }
    }

    public sealed class SlbAttachmentState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the application to which you want to bind an SLB instance.
        /// </summary>
        [Input("appId")]
        public Input<string>? AppId { get; set; }

        /// <summary>
        /// The listening port for the bound SLB instance.
        /// </summary>
        [Input("listenerPort")]
        public Input<int>? ListenerPort { get; set; }

        /// <summary>
        /// The ID of the SLB instance that is going to be bound.
        /// </summary>
        [Input("slbId")]
        public Input<string>? SlbId { get; set; }

        /// <summary>
        /// The IP address that is allocated to the bound SLB instance.
        /// </summary>
        [Input("slbIp")]
        public Input<string>? SlbIp { get; set; }

        /// <summary>
        /// Running Status of SLB instance. Inactive：The instance is stopped, and listener will not monitor and forward traffic. Active：The instance is running. After the instance is created, the default state is active. Locked：The instance is locked, the instance has been owed or locked by Alibaba Cloud. Expired: The instance has expired.
        /// </summary>
        [Input("slbStatus")]
        public Input<string>? SlbStatus { get; set; }

        /// <summary>
        /// The type of the bound SLB instance.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// The ID of the virtual server (VServer) group associated with the intranet SLB instance.
        /// </summary>
        [Input("vserverGroupId")]
        public Input<string>? VserverGroupId { get; set; }

        /// <summary>
        /// VPC related vswitch ID.
        /// </summary>
        [Input("vswitchId")]
        public Input<string>? VswitchId { get; set; }

        public SlbAttachmentState()
        {
        }
    }
}
