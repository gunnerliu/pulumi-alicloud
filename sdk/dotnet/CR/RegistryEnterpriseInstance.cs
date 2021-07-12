// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CR
{
    /// <summary>
    /// This resource will help you to manager Container Registry Enterprise Edition instances.
    /// 
    /// For information about Container Registry Enterprise Edition instances and how to use it, see [Create a Instance](https://www.alibabacloud.com/help/en/doc-detail/208144.htm)
    /// 
    /// &gt; **NOTE:** Available in v1.124.0+.
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
    ///         var my_instance = new AliCloud.CR.RegistryEnterpriseInstance("my-instance", new AliCloud.CR.RegistryEnterpriseInstanceArgs
    ///         {
    ///             InstanceName = "test",
    ///             InstanceType = "Standard",
    ///             PaymentType = "Subscription",
    ///             Period = 12,
    ///             RenewPeriod = 12,
    ///             RenewalStatus = "AutoRenewal",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Container Registry Enterprise Edition instance can be imported using the `id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:cr/registryEnterpriseInstance:RegistryEnterpriseInstance default cri-test
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:cr/registryEnterpriseInstance:RegistryEnterpriseInstance")]
    public partial class RegistryEnterpriseInstance : Pulumi.CustomResource
    {
        /// <summary>
        /// Time of Container Registry Enterprise Edition instance creation.
        /// </summary>
        [Output("createdTime")]
        public Output<string> CreatedTime { get; private set; } = null!;

        /// <summary>
        /// Name of your customized oss bucket. Use this bucket as instance storage if set.
        /// </summary>
        [Output("customOssBucket")]
        public Output<string?> CustomOssBucket { get; private set; } = null!;

        /// <summary>
        /// Time of Container Registry Enterprise Edition instance expiration.
        /// </summary>
        [Output("endTime")]
        public Output<string> EndTime { get; private set; } = null!;

        /// <summary>
        /// Name of Container Registry Enterprise Edition instance.
        /// </summary>
        [Output("instanceName")]
        public Output<string> InstanceName { get; private set; } = null!;

        /// <summary>
        /// Type of Container Registry Enterprise Edition instance. Valid values: `Basic`, `Standard`, `Advanced`.
        /// </summary>
        [Output("instanceType")]
        public Output<string> InstanceType { get; private set; } = null!;

        /// <summary>
        /// Subscription of Container Registry Enterprise Edition instance. Default value: `Subscription`. Valid values: `Subscription`.
        /// </summary>
        [Output("paymentType")]
        public Output<string?> PaymentType { get; private set; } = null!;

        /// <summary>
        /// Service time of Container Registry Enterprise Edition instance. Default value: `12`. Valid values: `1`, `2`, `3`, `6`, `12`, `24`, `36`, `48`, `60`. Unit: `month`.
        /// </summary>
        [Output("period")]
        public Output<int?> Period { get; private set; } = null!;

        /// <summary>
        /// Renewal period of Container Registry Enterprise Edition instance. Unit: `month`.
        /// </summary>
        [Output("renewPeriod")]
        public Output<int?> RenewPeriod { get; private set; } = null!;

        /// <summary>
        /// Renewal status of Container Registry Enterprise Edition instance. Valid values: `AutoRenewal`, `ManualRenewal`.
        /// </summary>
        [Output("renewalStatus")]
        public Output<string?> RenewalStatus { get; private set; } = null!;

        /// <summary>
        /// Status of Container Registry Enterprise Edition instance.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;


        /// <summary>
        /// Create a RegistryEnterpriseInstance resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RegistryEnterpriseInstance(string name, RegistryEnterpriseInstanceArgs args, CustomResourceOptions? options = null)
            : base("alicloud:cr/registryEnterpriseInstance:RegistryEnterpriseInstance", name, args ?? new RegistryEnterpriseInstanceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RegistryEnterpriseInstance(string name, Input<string> id, RegistryEnterpriseInstanceState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:cr/registryEnterpriseInstance:RegistryEnterpriseInstance", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing RegistryEnterpriseInstance resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RegistryEnterpriseInstance Get(string name, Input<string> id, RegistryEnterpriseInstanceState? state = null, CustomResourceOptions? options = null)
        {
            return new RegistryEnterpriseInstance(name, id, state, options);
        }
    }

    public sealed class RegistryEnterpriseInstanceArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of your customized oss bucket. Use this bucket as instance storage if set.
        /// </summary>
        [Input("customOssBucket")]
        public Input<string>? CustomOssBucket { get; set; }

        /// <summary>
        /// Name of Container Registry Enterprise Edition instance.
        /// </summary>
        [Input("instanceName", required: true)]
        public Input<string> InstanceName { get; set; } = null!;

        /// <summary>
        /// Type of Container Registry Enterprise Edition instance. Valid values: `Basic`, `Standard`, `Advanced`.
        /// </summary>
        [Input("instanceType", required: true)]
        public Input<string> InstanceType { get; set; } = null!;

        /// <summary>
        /// Subscription of Container Registry Enterprise Edition instance. Default value: `Subscription`. Valid values: `Subscription`.
        /// </summary>
        [Input("paymentType")]
        public Input<string>? PaymentType { get; set; }

        /// <summary>
        /// Service time of Container Registry Enterprise Edition instance. Default value: `12`. Valid values: `1`, `2`, `3`, `6`, `12`, `24`, `36`, `48`, `60`. Unit: `month`.
        /// </summary>
        [Input("period")]
        public Input<int>? Period { get; set; }

        /// <summary>
        /// Renewal period of Container Registry Enterprise Edition instance. Unit: `month`.
        /// </summary>
        [Input("renewPeriod")]
        public Input<int>? RenewPeriod { get; set; }

        /// <summary>
        /// Renewal status of Container Registry Enterprise Edition instance. Valid values: `AutoRenewal`, `ManualRenewal`.
        /// </summary>
        [Input("renewalStatus")]
        public Input<string>? RenewalStatus { get; set; }

        public RegistryEnterpriseInstanceArgs()
        {
        }
    }

    public sealed class RegistryEnterpriseInstanceState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Time of Container Registry Enterprise Edition instance creation.
        /// </summary>
        [Input("createdTime")]
        public Input<string>? CreatedTime { get; set; }

        /// <summary>
        /// Name of your customized oss bucket. Use this bucket as instance storage if set.
        /// </summary>
        [Input("customOssBucket")]
        public Input<string>? CustomOssBucket { get; set; }

        /// <summary>
        /// Time of Container Registry Enterprise Edition instance expiration.
        /// </summary>
        [Input("endTime")]
        public Input<string>? EndTime { get; set; }

        /// <summary>
        /// Name of Container Registry Enterprise Edition instance.
        /// </summary>
        [Input("instanceName")]
        public Input<string>? InstanceName { get; set; }

        /// <summary>
        /// Type of Container Registry Enterprise Edition instance. Valid values: `Basic`, `Standard`, `Advanced`.
        /// </summary>
        [Input("instanceType")]
        public Input<string>? InstanceType { get; set; }

        /// <summary>
        /// Subscription of Container Registry Enterprise Edition instance. Default value: `Subscription`. Valid values: `Subscription`.
        /// </summary>
        [Input("paymentType")]
        public Input<string>? PaymentType { get; set; }

        /// <summary>
        /// Service time of Container Registry Enterprise Edition instance. Default value: `12`. Valid values: `1`, `2`, `3`, `6`, `12`, `24`, `36`, `48`, `60`. Unit: `month`.
        /// </summary>
        [Input("period")]
        public Input<int>? Period { get; set; }

        /// <summary>
        /// Renewal period of Container Registry Enterprise Edition instance. Unit: `month`.
        /// </summary>
        [Input("renewPeriod")]
        public Input<int>? RenewPeriod { get; set; }

        /// <summary>
        /// Renewal status of Container Registry Enterprise Edition instance. Valid values: `AutoRenewal`, `ManualRenewal`.
        /// </summary>
        [Input("renewalStatus")]
        public Input<string>? RenewalStatus { get; set; }

        /// <summary>
        /// Status of Container Registry Enterprise Edition instance.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public RegistryEnterpriseInstanceState()
        {
        }
    }
}