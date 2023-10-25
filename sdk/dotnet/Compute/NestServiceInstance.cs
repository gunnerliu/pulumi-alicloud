// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Compute
{
    /// <summary>
    /// Provides a Compute Nest Service Instance resource.
    /// 
    /// For information about Compute Nest Service Instance and how to use it, see [What is Service Instance](https://www.alibabacloud.com/help/en/compute-nest/developer-reference/api-computenest-2021-06-01-createserviceinstance).
    /// 
    /// &gt; **NOTE:** Available since v1.205.0.
    /// 
    /// ## Import
    /// 
    /// Compute Nest Service Instance can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:compute/nestServiceInstance:NestServiceInstance example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:compute/nestServiceInstance:NestServiceInstance")]
    public partial class NestServiceInstance : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The order information of cloud market. See `commodity` below.
        /// </summary>
        [Output("commodity")]
        public Output<Outputs.NestServiceInstanceCommodity?> Commodity { get; private set; } = null!;

        /// <summary>
        /// Whether the service instance has the O&amp;M function. Default value: `false`. Valid values:
        /// </summary>
        [Output("enableInstanceOps")]
        public Output<bool> EnableInstanceOps { get; private set; } = null!;

        /// <summary>
        /// Whether Prometheus monitoring is enabled. Default value: `false`. Valid values:
        /// </summary>
        [Output("enableUserPrometheus")]
        public Output<bool> EnableUserPrometheus { get; private set; } = null!;

        /// <summary>
        /// The configuration of O&amp;M. See `operation_metadata` below.
        /// </summary>
        [Output("operationMetadata")]
        public Output<Outputs.NestServiceInstanceOperationMetadata> OperationMetadata { get; private set; } = null!;

        /// <summary>
        /// The parameters entered by the deployment service instance.
        /// </summary>
        [Output("parameters")]
        public Output<string?> Parameters { get; private set; } = null!;

        /// <summary>
        /// The type of payment. Valid values: `Permanent`, `Subscription`, `PayAsYouGo`, `CustomFixTime`.
        /// </summary>
        [Output("paymentType")]
        public Output<string> PaymentType { get; private set; } = null!;

        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        [Output("resourceGroupId")]
        public Output<string> ResourceGroupId { get; private set; } = null!;

        /// <summary>
        /// The ID of the service.
        /// </summary>
        [Output("serviceId")]
        public Output<string> ServiceId { get; private set; } = null!;

        /// <summary>
        /// The name of the Service Instance.
        /// </summary>
        [Output("serviceInstanceName")]
        public Output<string> ServiceInstanceName { get; private set; } = null!;

        /// <summary>
        /// The version of the service.
        /// </summary>
        [Output("serviceVersion")]
        public Output<string> ServiceVersion { get; private set; } = null!;

        /// <summary>
        /// The name of the specification.
        /// </summary>
        [Output("specificationName")]
        public Output<string?> SpecificationName { get; private set; } = null!;

        /// <summary>
        /// The status of the Service Instance.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, object>?> Tags { get; private set; } = null!;

        /// <summary>
        /// The name of the template.
        /// </summary>
        [Output("templateName")]
        public Output<string> TemplateName { get; private set; } = null!;


        /// <summary>
        /// Create a NestServiceInstance resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public NestServiceInstance(string name, NestServiceInstanceArgs args, CustomResourceOptions? options = null)
            : base("alicloud:compute/nestServiceInstance:NestServiceInstance", name, args ?? new NestServiceInstanceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private NestServiceInstance(string name, Input<string> id, NestServiceInstanceState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:compute/nestServiceInstance:NestServiceInstance", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing NestServiceInstance resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static NestServiceInstance Get(string name, Input<string> id, NestServiceInstanceState? state = null, CustomResourceOptions? options = null)
        {
            return new NestServiceInstance(name, id, state, options);
        }
    }

    public sealed class NestServiceInstanceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The order information of cloud market. See `commodity` below.
        /// </summary>
        [Input("commodity")]
        public Input<Inputs.NestServiceInstanceCommodityArgs>? Commodity { get; set; }

        /// <summary>
        /// Whether the service instance has the O&amp;M function. Default value: `false`. Valid values:
        /// </summary>
        [Input("enableInstanceOps")]
        public Input<bool>? EnableInstanceOps { get; set; }

        /// <summary>
        /// Whether Prometheus monitoring is enabled. Default value: `false`. Valid values:
        /// </summary>
        [Input("enableUserPrometheus")]
        public Input<bool>? EnableUserPrometheus { get; set; }

        /// <summary>
        /// The configuration of O&amp;M. See `operation_metadata` below.
        /// </summary>
        [Input("operationMetadata")]
        public Input<Inputs.NestServiceInstanceOperationMetadataArgs>? OperationMetadata { get; set; }

        /// <summary>
        /// The parameters entered by the deployment service instance.
        /// </summary>
        [Input("parameters")]
        public Input<string>? Parameters { get; set; }

        /// <summary>
        /// The type of payment. Valid values: `Permanent`, `Subscription`, `PayAsYouGo`, `CustomFixTime`.
        /// </summary>
        [Input("paymentType")]
        public Input<string>? PaymentType { get; set; }

        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The ID of the service.
        /// </summary>
        [Input("serviceId", required: true)]
        public Input<string> ServiceId { get; set; } = null!;

        /// <summary>
        /// The name of the Service Instance.
        /// </summary>
        [Input("serviceInstanceName")]
        public Input<string>? ServiceInstanceName { get; set; }

        /// <summary>
        /// The version of the service.
        /// </summary>
        [Input("serviceVersion", required: true)]
        public Input<string> ServiceVersion { get; set; } = null!;

        /// <summary>
        /// The name of the specification.
        /// </summary>
        [Input("specificationName")]
        public Input<string>? SpecificationName { get; set; }

        [Input("tags")]
        private InputMap<object>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        /// <summary>
        /// The name of the template.
        /// </summary>
        [Input("templateName")]
        public Input<string>? TemplateName { get; set; }

        public NestServiceInstanceArgs()
        {
        }
        public static new NestServiceInstanceArgs Empty => new NestServiceInstanceArgs();
    }

    public sealed class NestServiceInstanceState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The order information of cloud market. See `commodity` below.
        /// </summary>
        [Input("commodity")]
        public Input<Inputs.NestServiceInstanceCommodityGetArgs>? Commodity { get; set; }

        /// <summary>
        /// Whether the service instance has the O&amp;M function. Default value: `false`. Valid values:
        /// </summary>
        [Input("enableInstanceOps")]
        public Input<bool>? EnableInstanceOps { get; set; }

        /// <summary>
        /// Whether Prometheus monitoring is enabled. Default value: `false`. Valid values:
        /// </summary>
        [Input("enableUserPrometheus")]
        public Input<bool>? EnableUserPrometheus { get; set; }

        /// <summary>
        /// The configuration of O&amp;M. See `operation_metadata` below.
        /// </summary>
        [Input("operationMetadata")]
        public Input<Inputs.NestServiceInstanceOperationMetadataGetArgs>? OperationMetadata { get; set; }

        /// <summary>
        /// The parameters entered by the deployment service instance.
        /// </summary>
        [Input("parameters")]
        public Input<string>? Parameters { get; set; }

        /// <summary>
        /// The type of payment. Valid values: `Permanent`, `Subscription`, `PayAsYouGo`, `CustomFixTime`.
        /// </summary>
        [Input("paymentType")]
        public Input<string>? PaymentType { get; set; }

        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The ID of the service.
        /// </summary>
        [Input("serviceId")]
        public Input<string>? ServiceId { get; set; }

        /// <summary>
        /// The name of the Service Instance.
        /// </summary>
        [Input("serviceInstanceName")]
        public Input<string>? ServiceInstanceName { get; set; }

        /// <summary>
        /// The version of the service.
        /// </summary>
        [Input("serviceVersion")]
        public Input<string>? ServiceVersion { get; set; }

        /// <summary>
        /// The name of the specification.
        /// </summary>
        [Input("specificationName")]
        public Input<string>? SpecificationName { get; set; }

        /// <summary>
        /// The status of the Service Instance.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("tags")]
        private InputMap<object>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        /// <summary>
        /// The name of the template.
        /// </summary>
        [Input("templateName")]
        public Input<string>? TemplateName { get; set; }

        public NestServiceInstanceState()
        {
        }
        public static new NestServiceInstanceState Empty => new NestServiceInstanceState();
    }
}
