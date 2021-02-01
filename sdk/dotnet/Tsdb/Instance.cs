// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Tsdb
{
    /// <summary>
    /// Provides a Time Series Database (TSDB) Instance resource.
    /// 
    /// For information about Time Series Database (TSDB) Instance and how to use it, see [What is Time Series Database (TSDB)](https://www.alibabacloud.com/help/en/doc-detail/55652.htm).
    /// 
    /// &gt; **NOTE:** Available in v1.112.0+.
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
    ///         var exampleZones = Output.Create(AliCloud.Tsdb.GetZones.InvokeAsync());
    ///         var exampleNetwork = new AliCloud.Vpc.Network("exampleNetwork", new AliCloud.Vpc.NetworkArgs
    ///         {
    ///             CidrBlock = "192.168.0.0/16",
    ///         });
    ///         var exampleSwitch = new AliCloud.Vpc.Switch("exampleSwitch", new AliCloud.Vpc.SwitchArgs
    ///         {
    ///             AvailabilityZone = exampleZones.Apply(exampleZones =&gt; exampleZones.Ids[0]),
    ///             CidrBlock = "192.168.1.0/24",
    ///             VpcId = exampleNetwork.Id,
    ///         });
    ///         var exampleInstance = new AliCloud.Tsdb.Instance("exampleInstance", new AliCloud.Tsdb.InstanceArgs
    ///         {
    ///             PaymentType = "PayAsYouGo",
    ///             VswitchId = exampleSwitch.Id,
    ///             InstanceStorage = "50",
    ///             InstanceClass = "tsdb.1x.basic",
    ///             EngineType = "tsdb_tsdb",
    ///             InstanceAlias = "tf-testaccTsdbInstance",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// TSDB Instance can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:tsdb/instance:Instance example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:tsdb/instance:Instance")]
    public partial class Instance : Pulumi.CustomResource
    {
        /// <summary>
        /// The app key.
        /// </summary>
        [Output("appKey")]
        public Output<string?> AppKey { get; private set; } = null!;

        /// <summary>
        /// The disk type of instance. Valid when the engine type is `tsdb_influxdb`. `cloud_ssd` refers to SSD disk, `cloud_efficiency` refers to efficiency disk, `cloud_essd` refers to ESSD PL1 disk. Valid values: `cloud_efficiency`, `cloud_essd`, `cloud_ssd`.
        /// </summary>
        [Output("diskCategory")]
        public Output<string?> DiskCategory { get; private set; } = null!;

        /// <summary>
        /// The duration.
        /// </summary>
        [Output("duration")]
        public Output<string?> Duration { get; private set; } = null!;

        /// <summary>
        /// The engine type of instance Enumerative: `tsdb_tsdb` refers to TSDB, `tsdb_influxdb` refers to TSDB for InfluxDB️.
        /// </summary>
        [Output("engineType")]
        public Output<string?> EngineType { get; private set; } = null!;

        /// <summary>
        /// The alias of the instance.
        /// </summary>
        [Output("instanceAlias")]
        public Output<string?> InstanceAlias { get; private set; } = null!;

        /// <summary>
        /// The specification of the instance. 
        /// - Following enumerative value for TSDB for InfluxDB️ standart edition:
        /// - `influxdata.n1.mxlarge` refers to 2 CPU 8GB memory;
        /// - `influxdata.n1.xlarge` refers to 4 CPU 16GB memory;
        /// - `influxdata.n1.2xlarge` refers to 8 CPU 32 GB memory;
        /// - `influxdata.n1.4xlarge` refers to 16 CPU 64 GB memory;
        /// - `influxdata.n1.8xlarge` refers to 32 CPU 128 GB memory;
        /// - `influxdata.n1.16xlarge` refers to 64 CPU 256 GB memory.
        /// - Following enumerative value for TSDB for InfluxDB High-availability edition:
        /// - `influxdata.n1.mxlarge_ha` refers to 2 CPU 8GB memory;
        /// - `influxdata.n1.xlarge_ha` refers to 4 CPU 16GB memory;
        /// - `influxdata.n1.2xlarge_ha` refers to 8 CPU 32 GB memory;
        /// - `influxdata.n1.4xlarge_ha` refers to 16 CPU 64 GB memory;
        /// - `influxdata.n1.8xlarge_ha` refers to 32 CPU 128 GB memory;
        /// - `influxdata.n1.16xlarge_ha` refers to 64 CPU 256 GB memory.
        /// - Following enumerative value for TSDB:
        /// - `tsdb.1x.basic` refers to basic edition I;
        /// - `tsdb.3x.basic` refers to basic edition II;
        /// - `tsdb.4x.basic` refers to basic edtion III;
        /// - `tsdb.12x.standard` refers to standard edition I;
        /// - `tsdb.24x.standard` refers to standard edition II;
        /// - `tsdb.48x.large` refers to ultimate edition I;
        /// - `tsdb.94x.large` refers to ultimate edition II.
        /// </summary>
        [Output("instanceClass")]
        public Output<string> InstanceClass { get; private set; } = null!;

        /// <summary>
        /// The storage capacity of the instance. Unit: GB. For example, the value 50 indicates 50 GB. Does not support shrink storage.
        /// </summary>
        [Output("instanceStorage")]
        public Output<string> InstanceStorage { get; private set; } = null!;

        /// <summary>
        /// The billing method. Valid values: `PayAsYouGo` and `Subscription`. The `PayAsYouGo` value indicates the pay-as-you-go method, and the `Subscription` value indicates the subscription method.
        /// </summary>
        [Output("paymentType")]
        public Output<string> PaymentType { get; private set; } = null!;

        /// <summary>
        /// Instance status, enumerative: `ACTIVATION`, `DELETED`, `CREATING`, `CLASS_CHANGING`, `LOCKED`.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// The vswitch id.
        /// </summary>
        [Output("vswitchId")]
        public Output<string> VswitchId { get; private set; } = null!;

        /// <summary>
        /// The zone ID of the instance.
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a Instance resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Instance(string name, InstanceArgs args, CustomResourceOptions? options = null)
            : base("alicloud:tsdb/instance:Instance", name, args ?? new InstanceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Instance(string name, Input<string> id, InstanceState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:tsdb/instance:Instance", name, state, MakeResourceOptions(options, id))
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
        /// The app key.
        /// </summary>
        [Input("appKey")]
        public Input<string>? AppKey { get; set; }

        /// <summary>
        /// The disk type of instance. Valid when the engine type is `tsdb_influxdb`. `cloud_ssd` refers to SSD disk, `cloud_efficiency` refers to efficiency disk, `cloud_essd` refers to ESSD PL1 disk. Valid values: `cloud_efficiency`, `cloud_essd`, `cloud_ssd`.
        /// </summary>
        [Input("diskCategory")]
        public Input<string>? DiskCategory { get; set; }

        /// <summary>
        /// The duration.
        /// </summary>
        [Input("duration")]
        public Input<string>? Duration { get; set; }

        /// <summary>
        /// The engine type of instance Enumerative: `tsdb_tsdb` refers to TSDB, `tsdb_influxdb` refers to TSDB for InfluxDB️.
        /// </summary>
        [Input("engineType")]
        public Input<string>? EngineType { get; set; }

        /// <summary>
        /// The alias of the instance.
        /// </summary>
        [Input("instanceAlias")]
        public Input<string>? InstanceAlias { get; set; }

        /// <summary>
        /// The specification of the instance. 
        /// - Following enumerative value for TSDB for InfluxDB️ standart edition:
        /// - `influxdata.n1.mxlarge` refers to 2 CPU 8GB memory;
        /// - `influxdata.n1.xlarge` refers to 4 CPU 16GB memory;
        /// - `influxdata.n1.2xlarge` refers to 8 CPU 32 GB memory;
        /// - `influxdata.n1.4xlarge` refers to 16 CPU 64 GB memory;
        /// - `influxdata.n1.8xlarge` refers to 32 CPU 128 GB memory;
        /// - `influxdata.n1.16xlarge` refers to 64 CPU 256 GB memory.
        /// - Following enumerative value for TSDB for InfluxDB High-availability edition:
        /// - `influxdata.n1.mxlarge_ha` refers to 2 CPU 8GB memory;
        /// - `influxdata.n1.xlarge_ha` refers to 4 CPU 16GB memory;
        /// - `influxdata.n1.2xlarge_ha` refers to 8 CPU 32 GB memory;
        /// - `influxdata.n1.4xlarge_ha` refers to 16 CPU 64 GB memory;
        /// - `influxdata.n1.8xlarge_ha` refers to 32 CPU 128 GB memory;
        /// - `influxdata.n1.16xlarge_ha` refers to 64 CPU 256 GB memory.
        /// - Following enumerative value for TSDB:
        /// - `tsdb.1x.basic` refers to basic edition I;
        /// - `tsdb.3x.basic` refers to basic edition II;
        /// - `tsdb.4x.basic` refers to basic edtion III;
        /// - `tsdb.12x.standard` refers to standard edition I;
        /// - `tsdb.24x.standard` refers to standard edition II;
        /// - `tsdb.48x.large` refers to ultimate edition I;
        /// - `tsdb.94x.large` refers to ultimate edition II.
        /// </summary>
        [Input("instanceClass", required: true)]
        public Input<string> InstanceClass { get; set; } = null!;

        /// <summary>
        /// The storage capacity of the instance. Unit: GB. For example, the value 50 indicates 50 GB. Does not support shrink storage.
        /// </summary>
        [Input("instanceStorage", required: true)]
        public Input<string> InstanceStorage { get; set; } = null!;

        /// <summary>
        /// The billing method. Valid values: `PayAsYouGo` and `Subscription`. The `PayAsYouGo` value indicates the pay-as-you-go method, and the `Subscription` value indicates the subscription method.
        /// </summary>
        [Input("paymentType", required: true)]
        public Input<string> PaymentType { get; set; } = null!;

        /// <summary>
        /// The vswitch id.
        /// </summary>
        [Input("vswitchId", required: true)]
        public Input<string> VswitchId { get; set; } = null!;

        /// <summary>
        /// The zone ID of the instance.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public InstanceArgs()
        {
        }
    }

    public sealed class InstanceState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The app key.
        /// </summary>
        [Input("appKey")]
        public Input<string>? AppKey { get; set; }

        /// <summary>
        /// The disk type of instance. Valid when the engine type is `tsdb_influxdb`. `cloud_ssd` refers to SSD disk, `cloud_efficiency` refers to efficiency disk, `cloud_essd` refers to ESSD PL1 disk. Valid values: `cloud_efficiency`, `cloud_essd`, `cloud_ssd`.
        /// </summary>
        [Input("diskCategory")]
        public Input<string>? DiskCategory { get; set; }

        /// <summary>
        /// The duration.
        /// </summary>
        [Input("duration")]
        public Input<string>? Duration { get; set; }

        /// <summary>
        /// The engine type of instance Enumerative: `tsdb_tsdb` refers to TSDB, `tsdb_influxdb` refers to TSDB for InfluxDB️.
        /// </summary>
        [Input("engineType")]
        public Input<string>? EngineType { get; set; }

        /// <summary>
        /// The alias of the instance.
        /// </summary>
        [Input("instanceAlias")]
        public Input<string>? InstanceAlias { get; set; }

        /// <summary>
        /// The specification of the instance. 
        /// - Following enumerative value for TSDB for InfluxDB️ standart edition:
        /// - `influxdata.n1.mxlarge` refers to 2 CPU 8GB memory;
        /// - `influxdata.n1.xlarge` refers to 4 CPU 16GB memory;
        /// - `influxdata.n1.2xlarge` refers to 8 CPU 32 GB memory;
        /// - `influxdata.n1.4xlarge` refers to 16 CPU 64 GB memory;
        /// - `influxdata.n1.8xlarge` refers to 32 CPU 128 GB memory;
        /// - `influxdata.n1.16xlarge` refers to 64 CPU 256 GB memory.
        /// - Following enumerative value for TSDB for InfluxDB High-availability edition:
        /// - `influxdata.n1.mxlarge_ha` refers to 2 CPU 8GB memory;
        /// - `influxdata.n1.xlarge_ha` refers to 4 CPU 16GB memory;
        /// - `influxdata.n1.2xlarge_ha` refers to 8 CPU 32 GB memory;
        /// - `influxdata.n1.4xlarge_ha` refers to 16 CPU 64 GB memory;
        /// - `influxdata.n1.8xlarge_ha` refers to 32 CPU 128 GB memory;
        /// - `influxdata.n1.16xlarge_ha` refers to 64 CPU 256 GB memory.
        /// - Following enumerative value for TSDB:
        /// - `tsdb.1x.basic` refers to basic edition I;
        /// - `tsdb.3x.basic` refers to basic edition II;
        /// - `tsdb.4x.basic` refers to basic edtion III;
        /// - `tsdb.12x.standard` refers to standard edition I;
        /// - `tsdb.24x.standard` refers to standard edition II;
        /// - `tsdb.48x.large` refers to ultimate edition I;
        /// - `tsdb.94x.large` refers to ultimate edition II.
        /// </summary>
        [Input("instanceClass")]
        public Input<string>? InstanceClass { get; set; }

        /// <summary>
        /// The storage capacity of the instance. Unit: GB. For example, the value 50 indicates 50 GB. Does not support shrink storage.
        /// </summary>
        [Input("instanceStorage")]
        public Input<string>? InstanceStorage { get; set; }

        /// <summary>
        /// The billing method. Valid values: `PayAsYouGo` and `Subscription`. The `PayAsYouGo` value indicates the pay-as-you-go method, and the `Subscription` value indicates the subscription method.
        /// </summary>
        [Input("paymentType")]
        public Input<string>? PaymentType { get; set; }

        /// <summary>
        /// Instance status, enumerative: `ACTIVATION`, `DELETED`, `CREATING`, `CLASS_CHANGING`, `LOCKED`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The vswitch id.
        /// </summary>
        [Input("vswitchId")]
        public Input<string>? VswitchId { get; set; }

        /// <summary>
        /// The zone ID of the instance.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public InstanceState()
        {
        }
    }
}
