// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Sddp
{
    /// <summary>
    /// Provides a Data Security Center Instance resource.
    /// 
    /// For information about Data Security Center Instance and how to use it, see [What is Instance](https://help.aliyun.com/product/88674.html).
    /// 
    /// &gt; **NOTE:** Available in v1.136.0+.
    /// 
    /// &gt; **NOTE:** The Data Security Center Instance is not support in the international site.
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
    ///         var @default = new AliCloud.Sddp.Instance("default", new AliCloud.Sddp.InstanceArgs
    ///         {
    ///             Dataphin = "yes",
    ///             PaymentType = "Subscription",
    ///             Period = 1,
    ///             SdCbool = "yes",
    ///             Sdc = "3",
    ///             SddpVersion = "version_company",
    ///             UdCbool = "yes",
    ///             Udc = "2000",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Data Security Center Instance can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:sddp/instance:Instance example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:sddp/instance:Instance")]
    public partial class Instance : Pulumi.CustomResource
    {
        /// <summary>
        /// Whether the required RAM authorization is configured.
        /// </summary>
        [Output("authed")]
        public Output<bool> Authed { get; private set; } = null!;

        /// <summary>
        /// The dataphin. Valid values: `yes`,`no`.
        /// </summary>
        [Output("dataphin")]
        public Output<string?> Dataphin { get; private set; } = null!;

        /// <summary>
        /// The dataphin count. Valid values: 1 to 20.
        /// </summary>
        [Output("dataphinCount")]
        public Output<string?> DataphinCount { get; private set; } = null!;

        /// <summary>
        /// The number of instances.
        /// </summary>
        [Output("instanceNum")]
        public Output<string> InstanceNum { get; private set; } = null!;

        /// <summary>
        /// The logistics.
        /// </summary>
        [Output("logistics")]
        public Output<string?> Logistics { get; private set; } = null!;

        /// <summary>
        /// The modify type. Valid values: `Upgrade`, `Downgrade`.  **NOTE:** The `modify_type` is required when you execute a update operation.
        /// </summary>
        [Output("modifyType")]
        public Output<string?> ModifyType { get; private set; } = null!;

        /// <summary>
        /// Whether the authorized MaxCompute (ODPS) assets.
        /// </summary>
        [Output("odpsSet")]
        public Output<bool> OdpsSet { get; private set; } = null!;

        /// <summary>
        /// Whether the authorized oss assets.
        /// </summary>
        [Output("ossBucketSet")]
        public Output<bool> OssBucketSet { get; private set; } = null!;

        [Output("ossSize")]
        public Output<string> OssSize { get; private set; } = null!;

        /// <summary>
        /// The payment type of the resource. Valid values: `Subscription`.
        /// </summary>
        [Output("paymentType")]
        public Output<string> PaymentType { get; private set; } = null!;

        /// <summary>
        /// The Prepaid period. Valid values: `1`, `2`, `3`, `6`,`12`,`24`.
        /// </summary>
        [Output("period")]
        public Output<int> Period { get; private set; } = null!;

        /// <summary>
        /// Whether the authorized rds assets.
        /// </summary>
        [Output("rdsSet")]
        public Output<bool> RdsSet { get; private set; } = null!;

        [Output("remainDays")]
        public Output<string> RemainDays { get; private set; } = null!;

        /// <summary>
        /// Automatic renewal period. **NOTE:** The `renew_period` is required under the condition that renewal_status is `AutoRenewal`,
        /// </summary>
        [Output("renewPeriod")]
        public Output<int?> RenewPeriod { get; private set; } = null!;

        /// <summary>
        /// Automatic renewal status. Valid values: `AutoRenewal`,`ManualRenewal`. Default Value: `ManualRenewal`.
        /// </summary>
        [Output("renewalStatus")]
        public Output<string> RenewalStatus { get; private set; } = null!;

        /// <summary>
        /// Whether to use the database. Valid values:`yes`,`no`.
        /// </summary>
        [Output("sdCbool")]
        public Output<string> SdCbool { get; private set; } = null!;

        /// <summary>
        /// The number of instances.
        /// </summary>
        [Output("sdc")]
        public Output<string> Sdc { get; private set; } = null!;

        /// <summary>
        /// The sddp version. Valid values: `version_audit`,`version_company`,`version_dlp`.
        /// </summary>
        [Output("sddpVersion")]
        public Output<string> SddpVersion { get; private set; } = null!;

        /// <summary>
        /// The status of the resource.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// Whether to use OSS. Valid values: `yes`,`no`.
        /// </summary>
        [Output("udCbool")]
        public Output<string> UdCbool { get; private set; } = null!;

        /// <summary>
        /// OSS Size.
        /// </summary>
        [Output("udc")]
        public Output<string> Udc { get; private set; } = null!;


        /// <summary>
        /// Create a Instance resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Instance(string name, InstanceArgs args, CustomResourceOptions? options = null)
            : base("alicloud:sddp/instance:Instance", name, args ?? new InstanceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Instance(string name, Input<string> id, InstanceState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:sddp/instance:Instance", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Instance resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Instance Get(string name, Input<string> id, InstanceState? state = null, CustomResourceOptions? options = null)
        {
            return new Instance(name, id, state, options);
        }
    }

    public sealed class InstanceArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The dataphin. Valid values: `yes`,`no`.
        /// </summary>
        [Input("dataphin")]
        public Input<string>? Dataphin { get; set; }

        /// <summary>
        /// The dataphin count. Valid values: 1 to 20.
        /// </summary>
        [Input("dataphinCount")]
        public Input<string>? DataphinCount { get; set; }

        /// <summary>
        /// The logistics.
        /// </summary>
        [Input("logistics")]
        public Input<string>? Logistics { get; set; }

        /// <summary>
        /// The modify type. Valid values: `Upgrade`, `Downgrade`.  **NOTE:** The `modify_type` is required when you execute a update operation.
        /// </summary>
        [Input("modifyType")]
        public Input<string>? ModifyType { get; set; }

        /// <summary>
        /// The payment type of the resource. Valid values: `Subscription`.
        /// </summary>
        [Input("paymentType", required: true)]
        public Input<string> PaymentType { get; set; } = null!;

        /// <summary>
        /// The Prepaid period. Valid values: `1`, `2`, `3`, `6`,`12`,`24`.
        /// </summary>
        [Input("period", required: true)]
        public Input<int> Period { get; set; } = null!;

        /// <summary>
        /// Automatic renewal period. **NOTE:** The `renew_period` is required under the condition that renewal_status is `AutoRenewal`,
        /// </summary>
        [Input("renewPeriod")]
        public Input<int>? RenewPeriod { get; set; }

        /// <summary>
        /// Automatic renewal status. Valid values: `AutoRenewal`,`ManualRenewal`. Default Value: `ManualRenewal`.
        /// </summary>
        [Input("renewalStatus")]
        public Input<string>? RenewalStatus { get; set; }

        /// <summary>
        /// Whether to use the database. Valid values:`yes`,`no`.
        /// </summary>
        [Input("sdCbool", required: true)]
        public Input<string> SdCbool { get; set; } = null!;

        /// <summary>
        /// The number of instances.
        /// </summary>
        [Input("sdc", required: true)]
        public Input<string> Sdc { get; set; } = null!;

        /// <summary>
        /// The sddp version. Valid values: `version_audit`,`version_company`,`version_dlp`.
        /// </summary>
        [Input("sddpVersion", required: true)]
        public Input<string> SddpVersion { get; set; } = null!;

        /// <summary>
        /// Whether to use OSS. Valid values: `yes`,`no`.
        /// </summary>
        [Input("udCbool", required: true)]
        public Input<string> UdCbool { get; set; } = null!;

        /// <summary>
        /// OSS Size.
        /// </summary>
        [Input("udc", required: true)]
        public Input<string> Udc { get; set; } = null!;

        public InstanceArgs()
        {
        }
    }

    public sealed class InstanceState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether the required RAM authorization is configured.
        /// </summary>
        [Input("authed")]
        public Input<bool>? Authed { get; set; }

        /// <summary>
        /// The dataphin. Valid values: `yes`,`no`.
        /// </summary>
        [Input("dataphin")]
        public Input<string>? Dataphin { get; set; }

        /// <summary>
        /// The dataphin count. Valid values: 1 to 20.
        /// </summary>
        [Input("dataphinCount")]
        public Input<string>? DataphinCount { get; set; }

        /// <summary>
        /// The number of instances.
        /// </summary>
        [Input("instanceNum")]
        public Input<string>? InstanceNum { get; set; }

        /// <summary>
        /// The logistics.
        /// </summary>
        [Input("logistics")]
        public Input<string>? Logistics { get; set; }

        /// <summary>
        /// The modify type. Valid values: `Upgrade`, `Downgrade`.  **NOTE:** The `modify_type` is required when you execute a update operation.
        /// </summary>
        [Input("modifyType")]
        public Input<string>? ModifyType { get; set; }

        /// <summary>
        /// Whether the authorized MaxCompute (ODPS) assets.
        /// </summary>
        [Input("odpsSet")]
        public Input<bool>? OdpsSet { get; set; }

        /// <summary>
        /// Whether the authorized oss assets.
        /// </summary>
        [Input("ossBucketSet")]
        public Input<bool>? OssBucketSet { get; set; }

        [Input("ossSize")]
        public Input<string>? OssSize { get; set; }

        /// <summary>
        /// The payment type of the resource. Valid values: `Subscription`.
        /// </summary>
        [Input("paymentType")]
        public Input<string>? PaymentType { get; set; }

        /// <summary>
        /// The Prepaid period. Valid values: `1`, `2`, `3`, `6`,`12`,`24`.
        /// </summary>
        [Input("period")]
        public Input<int>? Period { get; set; }

        /// <summary>
        /// Whether the authorized rds assets.
        /// </summary>
        [Input("rdsSet")]
        public Input<bool>? RdsSet { get; set; }

        [Input("remainDays")]
        public Input<string>? RemainDays { get; set; }

        /// <summary>
        /// Automatic renewal period. **NOTE:** The `renew_period` is required under the condition that renewal_status is `AutoRenewal`,
        /// </summary>
        [Input("renewPeriod")]
        public Input<int>? RenewPeriod { get; set; }

        /// <summary>
        /// Automatic renewal status. Valid values: `AutoRenewal`,`ManualRenewal`. Default Value: `ManualRenewal`.
        /// </summary>
        [Input("renewalStatus")]
        public Input<string>? RenewalStatus { get; set; }

        /// <summary>
        /// Whether to use the database. Valid values:`yes`,`no`.
        /// </summary>
        [Input("sdCbool")]
        public Input<string>? SdCbool { get; set; }

        /// <summary>
        /// The number of instances.
        /// </summary>
        [Input("sdc")]
        public Input<string>? Sdc { get; set; }

        /// <summary>
        /// The sddp version. Valid values: `version_audit`,`version_company`,`version_dlp`.
        /// </summary>
        [Input("sddpVersion")]
        public Input<string>? SddpVersion { get; set; }

        /// <summary>
        /// The status of the resource.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// Whether to use OSS. Valid values: `yes`,`no`.
        /// </summary>
        [Input("udCbool")]
        public Input<string>? UdCbool { get; set; }

        /// <summary>
        /// OSS Size.
        /// </summary>
        [Input("udc")]
        public Input<string>? Udc { get; set; }

        public InstanceState()
        {
        }
    }
}
