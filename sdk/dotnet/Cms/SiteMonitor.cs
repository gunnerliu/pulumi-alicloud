// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cms
{
    /// <summary>
    /// This resource provides a site monitor resource and it can be used to monitor public endpoints and websites.
    /// Details at https://www.alibabacloud.com/help/doc-detail/67907.htm
    /// 
    /// &gt; **NOTE:** Available since v1.72.0.
    /// 
    /// ## Example Usage
    /// 
    /// Basic Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var basic = new AliCloud.Cms.SiteMonitor("basic", new()
    ///     {
    ///         Address = "http://www.alibabacloud.com",
    ///         Interval = 5,
    ///         IspCities = new[]
    ///         {
    ///             new AliCloud.Cms.Inputs.SiteMonitorIspCityArgs
    ///             {
    ///                 City = "546",
    ///                 Isp = "465",
    ///             },
    ///         },
    ///         OptionsJson = @"{
    ///     ""http_method"": ""get"",
    ///     ""waitTime_after_completion"": null,
    ///     ""ipv6_task"": false,
    ///     ""diagnosis_ping"": false,
    ///     ""diagnosis_mtr"": false,
    ///     ""assertions"": [
    ///         {
    ///             ""operator"": ""lessThan"",
    ///             ""type"": ""response_time"",
    ///             ""target"": 1000
    ///         }
    ///     ],
    ///     ""time_out"": 30000
    /// }
    /// 
    /// ",
    ///         TaskName = "tf-example",
    ///         TaskType = "HTTP",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Cloud Monitor Service Site Monitor can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:cms/siteMonitor:SiteMonitor example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:cms/siteMonitor:SiteMonitor")]
    public partial class SiteMonitor : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The URL or IP address monitored by the site monitoring task.
        /// </summary>
        [Output("address")]
        public Output<string> Address { get; private set; } = null!;

        /// <summary>
        /// The IDs of existing alert rules to be associated with the site monitoring task.
        /// </summary>
        [Output("alertIds")]
        public Output<ImmutableArray<string>> AlertIds { get; private set; } = null!;

        /// <summary>
        /// The time when the site monitoring task was created.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// The monitoring interval of the site monitoring task. Unit: minutes. Valid values: `1`, `5`, `15`, `30` and `60`. Default value: `1`. **NOTE:** From version 1.207.0, `interval` can be set to `30`, `60`.
        /// </summary>
        [Output("interval")]
        public Output<int?> Interval { get; private set; } = null!;

        /// <summary>
        /// The detection points in a JSON array. For example, `[{"city":"546","isp":"465"},{"city":"572","isp":"465"},{"city":"738","isp":"465"}]` indicates the detection points in Beijing, Hangzhou, and Qingdao respectively. You can call the [DescribeSiteMonitorISPCityList](https://www.alibabacloud.com/help/en/doc-detail/115045.htm) operation to query detection point information. If this parameter is not specified, three detection points will be chosen randomly for monitoring. See `isp_cities` below.
        /// </summary>
        [Output("ispCities")]
        public Output<ImmutableArray<Outputs.SiteMonitorIspCity>> IspCities { get; private set; } = null!;

        /// <summary>
        /// The extended options of the protocol of the site monitoring task. The options vary according to the protocol. See [extended options](https://www.alibabacloud.com/help/en/cms/developer-reference/api-cms-2019-01-01-createsitemonitor#api-detail-35).
        /// </summary>
        [Output("optionsJson")]
        public Output<string?> OptionsJson { get; private set; } = null!;

        /// <summary>
        /// The name of the site monitoring task. The name must be 4 to 100 characters in length. The name can contain the following types of characters: letters, digits, and underscores.
        /// </summary>
        [Output("taskName")]
        public Output<string> TaskName { get; private set; } = null!;

        /// <summary>
        /// The status of the site monitoring task.
        /// </summary>
        [Output("taskState")]
        public Output<string> TaskState { get; private set; } = null!;

        /// <summary>
        /// The protocol of the site monitoring task. Currently, site monitoring supports the following protocols: HTTP, PING, TCP, UDP, DNS, SMTP, POP3, and FTP.
        /// </summary>
        [Output("taskType")]
        public Output<string> TaskType { get; private set; } = null!;

        /// <summary>
        /// The time when the site monitoring task was updated.
        /// </summary>
        [Output("updateTime")]
        public Output<string> UpdateTime { get; private set; } = null!;


        /// <summary>
        /// Create a SiteMonitor resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SiteMonitor(string name, SiteMonitorArgs args, CustomResourceOptions? options = null)
            : base("alicloud:cms/siteMonitor:SiteMonitor", name, args ?? new SiteMonitorArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SiteMonitor(string name, Input<string> id, SiteMonitorState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:cms/siteMonitor:SiteMonitor", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SiteMonitor resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SiteMonitor Get(string name, Input<string> id, SiteMonitorState? state = null, CustomResourceOptions? options = null)
        {
            return new SiteMonitor(name, id, state, options);
        }
    }

    public sealed class SiteMonitorArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The URL or IP address monitored by the site monitoring task.
        /// </summary>
        [Input("address", required: true)]
        public Input<string> Address { get; set; } = null!;

        [Input("alertIds")]
        private InputList<string>? _alertIds;

        /// <summary>
        /// The IDs of existing alert rules to be associated with the site monitoring task.
        /// </summary>
        public InputList<string> AlertIds
        {
            get => _alertIds ?? (_alertIds = new InputList<string>());
            set => _alertIds = value;
        }

        /// <summary>
        /// The monitoring interval of the site monitoring task. Unit: minutes. Valid values: `1`, `5`, `15`, `30` and `60`. Default value: `1`. **NOTE:** From version 1.207.0, `interval` can be set to `30`, `60`.
        /// </summary>
        [Input("interval")]
        public Input<int>? Interval { get; set; }

        [Input("ispCities")]
        private InputList<Inputs.SiteMonitorIspCityArgs>? _ispCities;

        /// <summary>
        /// The detection points in a JSON array. For example, `[{"city":"546","isp":"465"},{"city":"572","isp":"465"},{"city":"738","isp":"465"}]` indicates the detection points in Beijing, Hangzhou, and Qingdao respectively. You can call the [DescribeSiteMonitorISPCityList](https://www.alibabacloud.com/help/en/doc-detail/115045.htm) operation to query detection point information. If this parameter is not specified, three detection points will be chosen randomly for monitoring. See `isp_cities` below.
        /// </summary>
        public InputList<Inputs.SiteMonitorIspCityArgs> IspCities
        {
            get => _ispCities ?? (_ispCities = new InputList<Inputs.SiteMonitorIspCityArgs>());
            set => _ispCities = value;
        }

        /// <summary>
        /// The extended options of the protocol of the site monitoring task. The options vary according to the protocol. See [extended options](https://www.alibabacloud.com/help/en/cms/developer-reference/api-cms-2019-01-01-createsitemonitor#api-detail-35).
        /// </summary>
        [Input("optionsJson")]
        public Input<string>? OptionsJson { get; set; }

        /// <summary>
        /// The name of the site monitoring task. The name must be 4 to 100 characters in length. The name can contain the following types of characters: letters, digits, and underscores.
        /// </summary>
        [Input("taskName", required: true)]
        public Input<string> TaskName { get; set; } = null!;

        /// <summary>
        /// The protocol of the site monitoring task. Currently, site monitoring supports the following protocols: HTTP, PING, TCP, UDP, DNS, SMTP, POP3, and FTP.
        /// </summary>
        [Input("taskType", required: true)]
        public Input<string> TaskType { get; set; } = null!;

        public SiteMonitorArgs()
        {
        }
        public static new SiteMonitorArgs Empty => new SiteMonitorArgs();
    }

    public sealed class SiteMonitorState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The URL or IP address monitored by the site monitoring task.
        /// </summary>
        [Input("address")]
        public Input<string>? Address { get; set; }

        [Input("alertIds")]
        private InputList<string>? _alertIds;

        /// <summary>
        /// The IDs of existing alert rules to be associated with the site monitoring task.
        /// </summary>
        public InputList<string> AlertIds
        {
            get => _alertIds ?? (_alertIds = new InputList<string>());
            set => _alertIds = value;
        }

        /// <summary>
        /// The time when the site monitoring task was created.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// The monitoring interval of the site monitoring task. Unit: minutes. Valid values: `1`, `5`, `15`, `30` and `60`. Default value: `1`. **NOTE:** From version 1.207.0, `interval` can be set to `30`, `60`.
        /// </summary>
        [Input("interval")]
        public Input<int>? Interval { get; set; }

        [Input("ispCities")]
        private InputList<Inputs.SiteMonitorIspCityGetArgs>? _ispCities;

        /// <summary>
        /// The detection points in a JSON array. For example, `[{"city":"546","isp":"465"},{"city":"572","isp":"465"},{"city":"738","isp":"465"}]` indicates the detection points in Beijing, Hangzhou, and Qingdao respectively. You can call the [DescribeSiteMonitorISPCityList](https://www.alibabacloud.com/help/en/doc-detail/115045.htm) operation to query detection point information. If this parameter is not specified, three detection points will be chosen randomly for monitoring. See `isp_cities` below.
        /// </summary>
        public InputList<Inputs.SiteMonitorIspCityGetArgs> IspCities
        {
            get => _ispCities ?? (_ispCities = new InputList<Inputs.SiteMonitorIspCityGetArgs>());
            set => _ispCities = value;
        }

        /// <summary>
        /// The extended options of the protocol of the site monitoring task. The options vary according to the protocol. See [extended options](https://www.alibabacloud.com/help/en/cms/developer-reference/api-cms-2019-01-01-createsitemonitor#api-detail-35).
        /// </summary>
        [Input("optionsJson")]
        public Input<string>? OptionsJson { get; set; }

        /// <summary>
        /// The name of the site monitoring task. The name must be 4 to 100 characters in length. The name can contain the following types of characters: letters, digits, and underscores.
        /// </summary>
        [Input("taskName")]
        public Input<string>? TaskName { get; set; }

        /// <summary>
        /// The status of the site monitoring task.
        /// </summary>
        [Input("taskState")]
        public Input<string>? TaskState { get; set; }

        /// <summary>
        /// The protocol of the site monitoring task. Currently, site monitoring supports the following protocols: HTTP, PING, TCP, UDP, DNS, SMTP, POP3, and FTP.
        /// </summary>
        [Input("taskType")]
        public Input<string>? TaskType { get; set; }

        /// <summary>
        /// The time when the site monitoring task was updated.
        /// </summary>
        [Input("updateTime")]
        public Input<string>? UpdateTime { get; set; }

        public SiteMonitorState()
        {
        }
        public static new SiteMonitorState Empty => new SiteMonitorState();
    }
}
