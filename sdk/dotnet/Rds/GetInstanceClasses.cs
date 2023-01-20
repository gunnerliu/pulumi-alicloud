// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Rds
{
    public static class GetInstanceClasses
    {
        /// <summary>
        /// This data source provides the RDS instance classes resource available info of Alibaba Cloud.
        /// 
        /// &gt; **NOTE:** Available in v1.46.0+
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var resources = AliCloud.Rds.GetInstanceClasses.Invoke(new()
        ///     {
        ///         Engine = "MySQL",
        ///         EngineVersion = "5.6",
        ///         InstanceChargeType = "PostPaid",
        ///         OutputFile = "./classes.txt",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstDbInstanceClass"] = resources.Apply(getInstanceClassesResult =&gt; getInstanceClassesResult.InstanceClasses[0]?.InstanceClass),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetInstanceClassesResult> InvokeAsync(GetInstanceClassesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetInstanceClassesResult>("alicloud:rds/getInstanceClasses:getInstanceClasses", args ?? new GetInstanceClassesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the RDS instance classes resource available info of Alibaba Cloud.
        /// 
        /// &gt; **NOTE:** Available in v1.46.0+
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var resources = AliCloud.Rds.GetInstanceClasses.Invoke(new()
        ///     {
        ///         Engine = "MySQL",
        ///         EngineVersion = "5.6",
        ///         InstanceChargeType = "PostPaid",
        ///         OutputFile = "./classes.txt",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstDbInstanceClass"] = resources.Apply(getInstanceClassesResult =&gt; getInstanceClassesResult.InstanceClasses[0]?.InstanceClass),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetInstanceClassesResult> Invoke(GetInstanceClassesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetInstanceClassesResult>("alicloud:rds/getInstanceClasses:getInstanceClasses", args ?? new GetInstanceClassesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetInstanceClassesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// DB Instance category. the value like [`Basic`, `HighAvailability`, `Finance`, `AlwaysOn`], [detail info](https://www.alibabacloud.com/help/doc-detail/69795.htm).
        /// </summary>
        [Input("category")]
        public string? Category { get; set; }

        /// <summary>
        /// The commodity code of the instance. Valid values:
        /// * **bards**: The instance is a pay-as-you-go primary instance. This value is available on the China site (aliyun.com).
        /// * **rds**: The instance is a subscription primary instance. This value is available on the China site (aliyun.com).
        /// * **rords**: The instance is a pay-as-you-go read-only instance. This value is available on the China site (aliyun.com).
        /// * **rds_rordspre_public_cn**: The instance is a subscription read-only instance. This value is available on the China site (aliyun.com).
        /// * **bards_intl**: The instance is a pay-as-you-go primary instance. This value is available on the International site (alibabacloud.com).
        /// * **rds_intl**: The instance is a subscription primary instance. This value is available on the International site (alibabacloud.com).
        /// * **rords_intl**: The instance is a pay-as-you-go read-only instance. This value is available on the International site (alibabacloud.com).
        /// * **rds_rordspre_public_intl**: The instance is a subscription read-only instance. This value is available on the International site (alibabacloud.com).
        /// </summary>
        [Input("commodityCode")]
        public string? CommodityCode { get; set; }

        /// <summary>
        /// The DB instance class type by the user.
        /// </summary>
        [Input("dbInstanceClass")]
        public string? DbInstanceClass { get; set; }

        /// <summary>
        /// The ID of the instance.
        /// </summary>
        [Input("dbInstanceId")]
        public string? DbInstanceId { get; set; }

        /// <summary>
        /// The DB instance storage space required by the user. Valid values: "cloud_ssd", "local_ssd", "cloud_essd", "cloud_essd2", "cloud_essd3".
        /// </summary>
        [Input("dbInstanceStorageType")]
        public string? DbInstanceStorageType { get; set; }

        /// <summary>
        /// Database type. Valid values:"MySQL", "SQLServer", "PostgreSQL", "PPAS", "MariaDB". If not set, it will match all of engines.
        /// </summary>
        [Input("engine")]
        public string? Engine { get; set; }

        /// <summary>
        /// Database version required by the user. Value options can refer to the latest docs [detail info](https://www.alibabacloud.com/help/doc-detail/26228.htm) `EngineVersion`.
        /// </summary>
        [Input("engineVersion")]
        public string? EngineVersion { get; set; }

        /// <summary>
        /// Filter the results by charge type. Valid values: `PrePaid` and `PostPaid`. Default to `PostPaid`.
        /// </summary>
        [Input("instanceChargeType")]
        public string? InstanceChargeType { get; set; }

        /// <summary>
        /// Whether to show multi available zone. Default false to not show multi availability zone.
        /// </summary>
        [Input("multiZone")]
        public bool? MultiZone { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        [Input("sortedBy")]
        public string? SortedBy { get; set; }

        /// <summary>
        /// It has been deprecated from version 1.134.0+ and using `db_instance_storage_type` instead.
        /// </summary>
        [Input("storageType")]
        public string? StorageType { get; set; }

        /// <summary>
        /// The Zone to launch the DB instance.
        /// </summary>
        [Input("zoneId")]
        public string? ZoneId { get; set; }

        public GetInstanceClassesArgs()
        {
        }
        public static new GetInstanceClassesArgs Empty => new GetInstanceClassesArgs();
    }

    public sealed class GetInstanceClassesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// DB Instance category. the value like [`Basic`, `HighAvailability`, `Finance`, `AlwaysOn`], [detail info](https://www.alibabacloud.com/help/doc-detail/69795.htm).
        /// </summary>
        [Input("category")]
        public Input<string>? Category { get; set; }

        /// <summary>
        /// The commodity code of the instance. Valid values:
        /// * **bards**: The instance is a pay-as-you-go primary instance. This value is available on the China site (aliyun.com).
        /// * **rds**: The instance is a subscription primary instance. This value is available on the China site (aliyun.com).
        /// * **rords**: The instance is a pay-as-you-go read-only instance. This value is available on the China site (aliyun.com).
        /// * **rds_rordspre_public_cn**: The instance is a subscription read-only instance. This value is available on the China site (aliyun.com).
        /// * **bards_intl**: The instance is a pay-as-you-go primary instance. This value is available on the International site (alibabacloud.com).
        /// * **rds_intl**: The instance is a subscription primary instance. This value is available on the International site (alibabacloud.com).
        /// * **rords_intl**: The instance is a pay-as-you-go read-only instance. This value is available on the International site (alibabacloud.com).
        /// * **rds_rordspre_public_intl**: The instance is a subscription read-only instance. This value is available on the International site (alibabacloud.com).
        /// </summary>
        [Input("commodityCode")]
        public Input<string>? CommodityCode { get; set; }

        /// <summary>
        /// The DB instance class type by the user.
        /// </summary>
        [Input("dbInstanceClass")]
        public Input<string>? DbInstanceClass { get; set; }

        /// <summary>
        /// The ID of the instance.
        /// </summary>
        [Input("dbInstanceId")]
        public Input<string>? DbInstanceId { get; set; }

        /// <summary>
        /// The DB instance storage space required by the user. Valid values: "cloud_ssd", "local_ssd", "cloud_essd", "cloud_essd2", "cloud_essd3".
        /// </summary>
        [Input("dbInstanceStorageType")]
        public Input<string>? DbInstanceStorageType { get; set; }

        /// <summary>
        /// Database type. Valid values:"MySQL", "SQLServer", "PostgreSQL", "PPAS", "MariaDB". If not set, it will match all of engines.
        /// </summary>
        [Input("engine")]
        public Input<string>? Engine { get; set; }

        /// <summary>
        /// Database version required by the user. Value options can refer to the latest docs [detail info](https://www.alibabacloud.com/help/doc-detail/26228.htm) `EngineVersion`.
        /// </summary>
        [Input("engineVersion")]
        public Input<string>? EngineVersion { get; set; }

        /// <summary>
        /// Filter the results by charge type. Valid values: `PrePaid` and `PostPaid`. Default to `PostPaid`.
        /// </summary>
        [Input("instanceChargeType")]
        public Input<string>? InstanceChargeType { get; set; }

        /// <summary>
        /// Whether to show multi available zone. Default false to not show multi availability zone.
        /// </summary>
        [Input("multiZone")]
        public Input<bool>? MultiZone { get; set; }

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        [Input("sortedBy")]
        public Input<string>? SortedBy { get; set; }

        /// <summary>
        /// It has been deprecated from version 1.134.0+ and using `db_instance_storage_type` instead.
        /// </summary>
        [Input("storageType")]
        public Input<string>? StorageType { get; set; }

        /// <summary>
        /// The Zone to launch the DB instance.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public GetInstanceClassesInvokeArgs()
        {
        }
        public static new GetInstanceClassesInvokeArgs Empty => new GetInstanceClassesInvokeArgs();
    }


    [OutputType]
    public sealed class GetInstanceClassesResult
    {
        public readonly string? Category;
        public readonly string? CommodityCode;
        public readonly string? DbInstanceClass;
        public readonly string? DbInstanceId;
        public readonly string? DbInstanceStorageType;
        public readonly string? Engine;
        public readonly string? EngineVersion;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (Available in 1.60.0+) A list of Rds instance class codes.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly string? InstanceChargeType;
        /// <summary>
        /// A list of Rds available resource. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetInstanceClassesInstanceClassResult> InstanceClasses;
        public readonly bool? MultiZone;
        public readonly string? OutputFile;
        public readonly string? SortedBy;
        public readonly string? StorageType;
        public readonly string? ZoneId;

        [OutputConstructor]
        private GetInstanceClassesResult(
            string? category,

            string? commodityCode,

            string? dbInstanceClass,

            string? dbInstanceId,

            string? dbInstanceStorageType,

            string? engine,

            string? engineVersion,

            string id,

            ImmutableArray<string> ids,

            string? instanceChargeType,

            ImmutableArray<Outputs.GetInstanceClassesInstanceClassResult> instanceClasses,

            bool? multiZone,

            string? outputFile,

            string? sortedBy,

            string? storageType,

            string? zoneId)
        {
            Category = category;
            CommodityCode = commodityCode;
            DbInstanceClass = dbInstanceClass;
            DbInstanceId = dbInstanceId;
            DbInstanceStorageType = dbInstanceStorageType;
            Engine = engine;
            EngineVersion = engineVersion;
            Id = id;
            Ids = ids;
            InstanceChargeType = instanceChargeType;
            InstanceClasses = instanceClasses;
            MultiZone = multiZone;
            OutputFile = outputFile;
            SortedBy = sortedBy;
            StorageType = storageType;
            ZoneId = zoneId;
        }
    }
}
