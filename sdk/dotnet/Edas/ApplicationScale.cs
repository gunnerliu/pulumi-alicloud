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
    /// Provides an EDAS application scale resource.
    /// 
    /// &gt; **NOTE:** Available in 1.82.0+
    /// 
    /// ## Example Usage
    /// 
    /// 
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var @default = new AliCloud.Edas.ApplicationScale("default", new AliCloud.Edas.ApplicationScaleArgs
    ///         {
    ///             AppId = @var.App_id,
    ///             DeployGroup = @var.Deploy_group,
    ///             EcuInfos = @var.Ecu_info,
    ///             ForceStatus = @var.Force_status,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    public partial class ApplicationScale : Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the application that you want to deploy.
        /// </summary>
        [Output("appId")]
        public Output<string> AppId { get; private set; } = null!;

        /// <summary>
        /// The ID of the instance group to which you want to add ECS instances to scale out the application.
        /// </summary>
        [Output("deployGroup")]
        public Output<string> DeployGroup { get; private set; } = null!;

        /// <summary>
        /// The ecc information of the resource supplied above. The value is formulated as `&lt;ecc1,ecc2&gt;`.
        /// </summary>
        [Output("eccInfo")]
        public Output<string> EccInfo { get; private set; } = null!;

        /// <summary>
        /// The IDs of the Elastic Compute Unit (ECU) where you want to deploy the application. Type: List.
        /// </summary>
        [Output("ecuInfos")]
        public Output<ImmutableArray<string>> EcuInfos { get; private set; } = null!;

        /// <summary>
        /// This parameter specifies whether to forcibly remove an ECS instance where the application is deployed. It is set as true only after the ECS instance expires. In normal cases, this parameter do not need to be specified.
        /// </summary>
        [Output("forceStatus")]
        public Output<bool?> ForceStatus { get; private set; } = null!;


        /// <summary>
        /// Create a ApplicationScale resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ApplicationScale(string name, ApplicationScaleArgs args, CustomResourceOptions? options = null)
            : base("alicloud:edas/applicationScale:ApplicationScale", name, args ?? new ApplicationScaleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ApplicationScale(string name, Input<string> id, ApplicationScaleState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:edas/applicationScale:ApplicationScale", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ApplicationScale resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ApplicationScale Get(string name, Input<string> id, ApplicationScaleState? state = null, CustomResourceOptions? options = null)
        {
            return new ApplicationScale(name, id, state, options);
        }
    }

    public sealed class ApplicationScaleArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the application that you want to deploy.
        /// </summary>
        [Input("appId", required: true)]
        public Input<string> AppId { get; set; } = null!;

        /// <summary>
        /// The ID of the instance group to which you want to add ECS instances to scale out the application.
        /// </summary>
        [Input("deployGroup", required: true)]
        public Input<string> DeployGroup { get; set; } = null!;

        [Input("ecuInfos", required: true)]
        private InputList<string>? _ecuInfos;

        /// <summary>
        /// The IDs of the Elastic Compute Unit (ECU) where you want to deploy the application. Type: List.
        /// </summary>
        public InputList<string> EcuInfos
        {
            get => _ecuInfos ?? (_ecuInfos = new InputList<string>());
            set => _ecuInfos = value;
        }

        /// <summary>
        /// This parameter specifies whether to forcibly remove an ECS instance where the application is deployed. It is set as true only after the ECS instance expires. In normal cases, this parameter do not need to be specified.
        /// </summary>
        [Input("forceStatus")]
        public Input<bool>? ForceStatus { get; set; }

        public ApplicationScaleArgs()
        {
        }
    }

    public sealed class ApplicationScaleState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the application that you want to deploy.
        /// </summary>
        [Input("appId")]
        public Input<string>? AppId { get; set; }

        /// <summary>
        /// The ID of the instance group to which you want to add ECS instances to scale out the application.
        /// </summary>
        [Input("deployGroup")]
        public Input<string>? DeployGroup { get; set; }

        /// <summary>
        /// The ecc information of the resource supplied above. The value is formulated as `&lt;ecc1,ecc2&gt;`.
        /// </summary>
        [Input("eccInfo")]
        public Input<string>? EccInfo { get; set; }

        [Input("ecuInfos")]
        private InputList<string>? _ecuInfos;

        /// <summary>
        /// The IDs of the Elastic Compute Unit (ECU) where you want to deploy the application. Type: List.
        /// </summary>
        public InputList<string> EcuInfos
        {
            get => _ecuInfos ?? (_ecuInfos = new InputList<string>());
            set => _ecuInfos = value;
        }

        /// <summary>
        /// This parameter specifies whether to forcibly remove an ECS instance where the application is deployed. It is set as true only after the ECS instance expires. In normal cases, this parameter do not need to be specified.
        /// </summary>
        [Input("forceStatus")]
        public Input<bool>? ForceStatus { get; set; }

        public ApplicationScaleState()
        {
        }
    }
}
