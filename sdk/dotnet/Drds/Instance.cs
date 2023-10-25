// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Drds
{
    /// <summary>
    /// Distributed Relational Database Service (DRDS) is a lightweight (stateless), flexible, stable, and efficient middleware product independently developed by Alibaba Group to resolve scalability issues with single-host relational databases.
    /// With its compatibility with MySQL protocols and syntaxes, DRDS enables database/table sharding, smooth scaling, configuration upgrade/downgrade,
    /// transparent read/write splitting, and distributed transactions, providing O&amp;M capabilities for distributed databases throughout their entire lifecycle.
    /// 
    /// For information about DRDS and how to use it, see [What is DRDS](https://www.alibabacloud.com/help/product/29657.htm).
    /// 
    /// &gt; **NOTE:** At present, DRDS instance only can be supported in the regions: cn-shenzhen, cn-beijing, cn-hangzhou, cn-hongkong, cn-qingdao, ap-southeast-1.
    /// 
    /// &gt; **NOTE:** Currently, this resource only support `Domestic Site Account`.
    /// 
    /// ## Import
    /// 
    /// Distributed Relational Database Service (DRDS) can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:drds/instance:Instance example drds-abc123456
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:drds/instance:Instance")]
    public partial class Instance : global::Pulumi.CustomResource
    {
        /// <summary>
        /// (Available in 1.196.0+) The connection string of the DRDS instance.
        /// </summary>
        [Output("connectionString")]
        public Output<string> ConnectionString { get; private set; } = null!;

        /// <summary>
        /// Description of the DRDS instance, This description can have a string of 2 to 256 characters.
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// Valid values are `PrePaid`, `PostPaid`, Default to `PostPaid`.
        /// </summary>
        [Output("instanceChargeType")]
        public Output<string?> InstanceChargeType { get; private set; } = null!;

        /// <summary>
        /// The parameter of the instance series. **NOTE:**  `drds.sn1.4c8g`,`drds.sn1.8c16g`,`drds.sn1.16c32g`,`drds.sn1.32c64g` are no longer supported. Valid values:
        /// - `drds.sn2.4c16g` Starter Edition.
        /// - `drds.sn2.8c32g` Standard Edition.
        /// - `drds.sn2.16c64g` Enterprise Edition.
        /// </summary>
        [Output("instanceSeries")]
        public Output<string> InstanceSeries { get; private set; } = null!;

        /// <summary>
        /// The MySQL version supported by the instance, with the following range of values. `5`: Fully compatible with MySQL 5.x (default) `8`: Fully compatible with MySQL 8.0. This parameter takes effect when the primary instance is created, and the read-only instance has the same MySQL version as the primary instance by default.
        /// </summary>
        [Output("mysqlVersion")]
        public Output<int> MysqlVersion { get; private set; } = null!;

        /// <summary>
        /// (Available in 1.196.0+) The connection port of the DRDS instance.
        /// </summary>
        [Output("port")]
        public Output<string> Port { get; private set; } = null!;

        /// <summary>
        /// User-defined DRDS instance specification. Value range:
        /// - `drds.sn1.4c8g` for DRDS instance Starter version;
        /// - value range : `drds.sn1.4c8g.8c16g`, `drds.sn1.4c8g.16c32g`, `drds.sn1.4c8g.32c64g`, `drds.sn1.4c8g.64c128g`
        /// - `drds.sn1.8c16g` for DRDS instance Standard edition;
        /// - value range : `drds.sn1.8c16g.16c32g`, `drds.sn1.8c16g.32c64g`, `drds.sn1.8c16g.64c128g`
        /// - `drds.sn1.16c32g` for DRDS instance Enterprise Edition;
        /// - value range : `drds.sn1.16c32g.32c64g`, `drds.sn1.16c32g.64c128g`
        /// - `drds.sn1.32c64g` for DRDS instance Extreme Edition;
        /// - value range : `drds.sn1.32c64g.128c256g`
        /// </summary>
        [Output("specification")]
        public Output<string> Specification { get; private set; } = null!;

        /// <summary>
        /// The id of the VPC.
        /// </summary>
        [Output("vpcId")]
        public Output<string> VpcId { get; private set; } = null!;

        /// <summary>
        /// The VSwitch ID to launch in.
        /// </summary>
        [Output("vswitchId")]
        public Output<string> VswitchId { get; private set; } = null!;

        /// <summary>
        /// The Zone to launch the DRDS instance.
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
            : base("alicloud:drds/instance:Instance", name, args ?? new InstanceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Instance(string name, Input<string> id, InstanceState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:drds/instance:Instance", name, state, MakeResourceOptions(options, id))
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

    public sealed class InstanceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description of the DRDS instance, This description can have a string of 2 to 256 characters.
        /// </summary>
        [Input("description", required: true)]
        public Input<string> Description { get; set; } = null!;

        /// <summary>
        /// Valid values are `PrePaid`, `PostPaid`, Default to `PostPaid`.
        /// </summary>
        [Input("instanceChargeType")]
        public Input<string>? InstanceChargeType { get; set; }

        /// <summary>
        /// The parameter of the instance series. **NOTE:**  `drds.sn1.4c8g`,`drds.sn1.8c16g`,`drds.sn1.16c32g`,`drds.sn1.32c64g` are no longer supported. Valid values:
        /// - `drds.sn2.4c16g` Starter Edition.
        /// - `drds.sn2.8c32g` Standard Edition.
        /// - `drds.sn2.16c64g` Enterprise Edition.
        /// </summary>
        [Input("instanceSeries", required: true)]
        public Input<string> InstanceSeries { get; set; } = null!;

        /// <summary>
        /// The MySQL version supported by the instance, with the following range of values. `5`: Fully compatible with MySQL 5.x (default) `8`: Fully compatible with MySQL 8.0. This parameter takes effect when the primary instance is created, and the read-only instance has the same MySQL version as the primary instance by default.
        /// </summary>
        [Input("mysqlVersion")]
        public Input<int>? MysqlVersion { get; set; }

        /// <summary>
        /// User-defined DRDS instance specification. Value range:
        /// - `drds.sn1.4c8g` for DRDS instance Starter version;
        /// - value range : `drds.sn1.4c8g.8c16g`, `drds.sn1.4c8g.16c32g`, `drds.sn1.4c8g.32c64g`, `drds.sn1.4c8g.64c128g`
        /// - `drds.sn1.8c16g` for DRDS instance Standard edition;
        /// - value range : `drds.sn1.8c16g.16c32g`, `drds.sn1.8c16g.32c64g`, `drds.sn1.8c16g.64c128g`
        /// - `drds.sn1.16c32g` for DRDS instance Enterprise Edition;
        /// - value range : `drds.sn1.16c32g.32c64g`, `drds.sn1.16c32g.64c128g`
        /// - `drds.sn1.32c64g` for DRDS instance Extreme Edition;
        /// - value range : `drds.sn1.32c64g.128c256g`
        /// </summary>
        [Input("specification", required: true)]
        public Input<string> Specification { get; set; } = null!;

        /// <summary>
        /// The id of the VPC.
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        /// <summary>
        /// The VSwitch ID to launch in.
        /// </summary>
        [Input("vswitchId", required: true)]
        public Input<string> VswitchId { get; set; } = null!;

        /// <summary>
        /// The Zone to launch the DRDS instance.
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public InstanceArgs()
        {
        }
        public static new InstanceArgs Empty => new InstanceArgs();
    }

    public sealed class InstanceState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Available in 1.196.0+) The connection string of the DRDS instance.
        /// </summary>
        [Input("connectionString")]
        public Input<string>? ConnectionString { get; set; }

        /// <summary>
        /// Description of the DRDS instance, This description can have a string of 2 to 256 characters.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Valid values are `PrePaid`, `PostPaid`, Default to `PostPaid`.
        /// </summary>
        [Input("instanceChargeType")]
        public Input<string>? InstanceChargeType { get; set; }

        /// <summary>
        /// The parameter of the instance series. **NOTE:**  `drds.sn1.4c8g`,`drds.sn1.8c16g`,`drds.sn1.16c32g`,`drds.sn1.32c64g` are no longer supported. Valid values:
        /// - `drds.sn2.4c16g` Starter Edition.
        /// - `drds.sn2.8c32g` Standard Edition.
        /// - `drds.sn2.16c64g` Enterprise Edition.
        /// </summary>
        [Input("instanceSeries")]
        public Input<string>? InstanceSeries { get; set; }

        /// <summary>
        /// The MySQL version supported by the instance, with the following range of values. `5`: Fully compatible with MySQL 5.x (default) `8`: Fully compatible with MySQL 8.0. This parameter takes effect when the primary instance is created, and the read-only instance has the same MySQL version as the primary instance by default.
        /// </summary>
        [Input("mysqlVersion")]
        public Input<int>? MysqlVersion { get; set; }

        /// <summary>
        /// (Available in 1.196.0+) The connection port of the DRDS instance.
        /// </summary>
        [Input("port")]
        public Input<string>? Port { get; set; }

        /// <summary>
        /// User-defined DRDS instance specification. Value range:
        /// - `drds.sn1.4c8g` for DRDS instance Starter version;
        /// - value range : `drds.sn1.4c8g.8c16g`, `drds.sn1.4c8g.16c32g`, `drds.sn1.4c8g.32c64g`, `drds.sn1.4c8g.64c128g`
        /// - `drds.sn1.8c16g` for DRDS instance Standard edition;
        /// - value range : `drds.sn1.8c16g.16c32g`, `drds.sn1.8c16g.32c64g`, `drds.sn1.8c16g.64c128g`
        /// - `drds.sn1.16c32g` for DRDS instance Enterprise Edition;
        /// - value range : `drds.sn1.16c32g.32c64g`, `drds.sn1.16c32g.64c128g`
        /// - `drds.sn1.32c64g` for DRDS instance Extreme Edition;
        /// - value range : `drds.sn1.32c64g.128c256g`
        /// </summary>
        [Input("specification")]
        public Input<string>? Specification { get; set; }

        /// <summary>
        /// The id of the VPC.
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        /// <summary>
        /// The VSwitch ID to launch in.
        /// </summary>
        [Input("vswitchId")]
        public Input<string>? VswitchId { get; set; }

        /// <summary>
        /// The Zone to launch the DRDS instance.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public InstanceState()
        {
        }
        public static new InstanceState Empty => new InstanceState();
    }
}
