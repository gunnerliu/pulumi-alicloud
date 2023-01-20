// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Dns
{
    /// <summary>
    /// Provides a DNS Monitor Config resource.
    /// 
    /// For information about DNS Monitor Config and how to use it, see [What is Monitor Config](https://www.alibabacloud.com/help/en/doc-detail/198064.html).
    /// 
    /// &gt; **NOTE:** Available in v1.153.0+.
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
    ///     var config = new Config();
    ///     var name = config.Get("name") ?? "tf-testacc";
    ///     var domainName = config.Get("domainName") ?? "your_domain_name";
    ///     var defaultResourceGroups = AliCloud.ResourceManager.GetResourceGroups.Invoke();
    /// 
    ///     var defaultAlarmContactGroup = new AliCloud.Cms.AlarmContactGroup("defaultAlarmContactGroup", new()
    ///     {
    ///         AlarmContactGroupName = name,
    ///     });
    /// 
    ///     var defaultGtmInstance = new AliCloud.Dns.GtmInstance("defaultGtmInstance", new()
    ///     {
    ///         InstanceName = name,
    ///         PaymentType = "Subscription",
    ///         Period = 1,
    ///         RenewalStatus = "ManualRenewal",
    ///         PackageEdition = "ultimate",
    ///         HealthCheckTaskCount = 100,
    ///         SmsNotificationCount = 1000,
    ///         PublicCnameMode = "SYSTEM_ASSIGN",
    ///         Ttl = 60,
    ///         CnameType = "PUBLIC",
    ///         ResourceGroupId = defaultResourceGroups.Apply(getResourceGroupsResult =&gt; getResourceGroupsResult.Groups[0]?.Id),
    ///         AlertGroups = new[]
    ///         {
    ///             defaultAlarmContactGroup.AlarmContactGroupName,
    ///         },
    ///         PublicUserDomainName = domainName,
    ///         AlertConfigs = new[]
    ///         {
    ///             new AliCloud.Dns.Inputs.GtmInstanceAlertConfigArgs
    ///             {
    ///                 SmsNotice = true,
    ///                 NoticeType = "ADDR_ALERT",
    ///                 EmailNotice = true,
    ///                 DingtalkNotice = true,
    ///             },
    ///         },
    ///     });
    /// 
    ///     var defaultAddressPool = new AliCloud.Dns.AddressPool("defaultAddressPool", new()
    ///     {
    ///         AddressPoolName = name,
    ///         InstanceId = defaultGtmInstance.Id,
    ///         LbaStrategy = "RATIO",
    ///         Type = "IPV4",
    ///         Addresses = new[]
    ///         {
    ///             new AliCloud.Dns.Inputs.AddressPoolAddressArgs
    ///             {
    ///                 AttributeInfo = "{\"lineCodeRectifyType\":\"RECTIFIED\",\"lineCodes\":[\"os_namerica_us\"]}",
    ///                 Remark = "address_remark",
    ///                 Address = "1.1.1.1",
    ///                 Mode = "SMART",
    ///                 LbaWeight = 1,
    ///             },
    ///         },
    ///     });
    /// 
    ///     var defaultMonitorConfig = new AliCloud.Dns.MonitorConfig("defaultMonitorConfig", new()
    ///     {
    ///         AddrPoolId = defaultAddressPool.Id,
    ///         EvaluationCount = 1,
    ///         Interval = 60,
    ///         Timeout = 5000,
    ///         ProtocolType = "TCP",
    ///         MonitorExtendInfo = "{\"failureRate\"=50,\"port\"=80}",
    ///         IspCityNodes = 
    ///         {
    ///             { "cityCode", "503" },
    ///             { "ispCode", "465" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// DNS Monitor Config can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:dns/monitorConfig:MonitorConfig example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:dns/monitorConfig:MonitorConfig")]
    public partial class MonitorConfig : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the address pool.
        /// </summary>
        [Output("addrPoolId")]
        public Output<string> AddrPoolId { get; private set; } = null!;

        /// <summary>
        /// The number of consecutive times of failed health check attempts. Valid values: `1`, `2`, `3`.
        /// </summary>
        [Output("evaluationCount")]
        public Output<int> EvaluationCount { get; private set; } = null!;

        /// <summary>
        /// The health check interval. Unit: seconds. Valid values: `60`.
        /// </summary>
        [Output("interval")]
        public Output<int> Interval { get; private set; } = null!;

        /// <summary>
        /// The Monitoring node. See the following `Block isp_city_node`.
        /// </summary>
        [Output("ispCityNodes")]
        public Output<ImmutableArray<Outputs.MonitorConfigIspCityNode>> IspCityNodes { get; private set; } = null!;

        /// <summary>
        /// The lang.
        /// </summary>
        [Output("lang")]
        public Output<string?> Lang { get; private set; } = null!;

        /// <summary>
        /// The extended information. This value follows the json format. For more details, see the [description of MonitorExtendInfo in the Request parameters table for details](https://www.alibabacloud.com/help/en/doc-detail/198064.html).
        /// </summary>
        [Output("monitorExtendInfo")]
        public Output<string> MonitorExtendInfo { get; private set; } = null!;

        /// <summary>
        /// The health check protocol. Valid values: `HTTP`, `HTTPS`, `PING`, `TCP`.
        /// </summary>
        [Output("protocolType")]
        public Output<string> ProtocolType { get; private set; } = null!;

        /// <summary>
        /// The timeout period. Unit: milliseconds. Valid values: `2000`, `3000`, `5000`, `10000`.
        /// </summary>
        [Output("timeout")]
        public Output<int> Timeout { get; private set; } = null!;


        /// <summary>
        /// Create a MonitorConfig resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public MonitorConfig(string name, MonitorConfigArgs args, CustomResourceOptions? options = null)
            : base("alicloud:dns/monitorConfig:MonitorConfig", name, args ?? new MonitorConfigArgs(), MakeResourceOptions(options, ""))
        {
        }

        private MonitorConfig(string name, Input<string> id, MonitorConfigState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:dns/monitorConfig:MonitorConfig", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing MonitorConfig resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static MonitorConfig Get(string name, Input<string> id, MonitorConfigState? state = null, CustomResourceOptions? options = null)
        {
            return new MonitorConfig(name, id, state, options);
        }
    }

    public sealed class MonitorConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the address pool.
        /// </summary>
        [Input("addrPoolId", required: true)]
        public Input<string> AddrPoolId { get; set; } = null!;

        /// <summary>
        /// The number of consecutive times of failed health check attempts. Valid values: `1`, `2`, `3`.
        /// </summary>
        [Input("evaluationCount", required: true)]
        public Input<int> EvaluationCount { get; set; } = null!;

        /// <summary>
        /// The health check interval. Unit: seconds. Valid values: `60`.
        /// </summary>
        [Input("interval", required: true)]
        public Input<int> Interval { get; set; } = null!;

        [Input("ispCityNodes", required: true)]
        private InputList<Inputs.MonitorConfigIspCityNodeArgs>? _ispCityNodes;

        /// <summary>
        /// The Monitoring node. See the following `Block isp_city_node`.
        /// </summary>
        public InputList<Inputs.MonitorConfigIspCityNodeArgs> IspCityNodes
        {
            get => _ispCityNodes ?? (_ispCityNodes = new InputList<Inputs.MonitorConfigIspCityNodeArgs>());
            set => _ispCityNodes = value;
        }

        /// <summary>
        /// The lang.
        /// </summary>
        [Input("lang")]
        public Input<string>? Lang { get; set; }

        /// <summary>
        /// The extended information. This value follows the json format. For more details, see the [description of MonitorExtendInfo in the Request parameters table for details](https://www.alibabacloud.com/help/en/doc-detail/198064.html).
        /// </summary>
        [Input("monitorExtendInfo", required: true)]
        public Input<string> MonitorExtendInfo { get; set; } = null!;

        /// <summary>
        /// The health check protocol. Valid values: `HTTP`, `HTTPS`, `PING`, `TCP`.
        /// </summary>
        [Input("protocolType", required: true)]
        public Input<string> ProtocolType { get; set; } = null!;

        /// <summary>
        /// The timeout period. Unit: milliseconds. Valid values: `2000`, `3000`, `5000`, `10000`.
        /// </summary>
        [Input("timeout", required: true)]
        public Input<int> Timeout { get; set; } = null!;

        public MonitorConfigArgs()
        {
        }
        public static new MonitorConfigArgs Empty => new MonitorConfigArgs();
    }

    public sealed class MonitorConfigState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the address pool.
        /// </summary>
        [Input("addrPoolId")]
        public Input<string>? AddrPoolId { get; set; }

        /// <summary>
        /// The number of consecutive times of failed health check attempts. Valid values: `1`, `2`, `3`.
        /// </summary>
        [Input("evaluationCount")]
        public Input<int>? EvaluationCount { get; set; }

        /// <summary>
        /// The health check interval. Unit: seconds. Valid values: `60`.
        /// </summary>
        [Input("interval")]
        public Input<int>? Interval { get; set; }

        [Input("ispCityNodes")]
        private InputList<Inputs.MonitorConfigIspCityNodeGetArgs>? _ispCityNodes;

        /// <summary>
        /// The Monitoring node. See the following `Block isp_city_node`.
        /// </summary>
        public InputList<Inputs.MonitorConfigIspCityNodeGetArgs> IspCityNodes
        {
            get => _ispCityNodes ?? (_ispCityNodes = new InputList<Inputs.MonitorConfigIspCityNodeGetArgs>());
            set => _ispCityNodes = value;
        }

        /// <summary>
        /// The lang.
        /// </summary>
        [Input("lang")]
        public Input<string>? Lang { get; set; }

        /// <summary>
        /// The extended information. This value follows the json format. For more details, see the [description of MonitorExtendInfo in the Request parameters table for details](https://www.alibabacloud.com/help/en/doc-detail/198064.html).
        /// </summary>
        [Input("monitorExtendInfo")]
        public Input<string>? MonitorExtendInfo { get; set; }

        /// <summary>
        /// The health check protocol. Valid values: `HTTP`, `HTTPS`, `PING`, `TCP`.
        /// </summary>
        [Input("protocolType")]
        public Input<string>? ProtocolType { get; set; }

        /// <summary>
        /// The timeout period. Unit: milliseconds. Valid values: `2000`, `3000`, `5000`, `10000`.
        /// </summary>
        [Input("timeout")]
        public Input<int>? Timeout { get; set; }

        public MonitorConfigState()
        {
        }
        public static new MonitorConfigState Empty => new MonitorConfigState();
    }
}
