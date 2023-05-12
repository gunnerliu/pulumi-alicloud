// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.BastionHost
{
    public static class GetHosts
    {
        /// <summary>
        /// This data source provides the Bastionhost Hosts of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.135.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
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
        ///     var ids = AliCloud.BastionHost.GetHosts.Invoke(new()
        ///     {
        ///         InstanceId = "example_value",
        ///         Ids = new[]
        ///         {
        ///             "1",
        ///             "2",
        ///         },
        ///     });
        /// 
        ///     var nameRegex = AliCloud.BastionHost.GetHosts.Invoke(new()
        ///     {
        ///         InstanceId = "example_value",
        ///         NameRegex = "^my-Host",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["bastionhostHostId1"] = ids.Apply(getHostsResult =&gt; getHostsResult.Hosts[0]?.Id),
        ///         ["bastionhostHostId2"] = nameRegex.Apply(getHostsResult =&gt; getHostsResult.Hosts[0]?.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetHostsResult> InvokeAsync(GetHostsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetHostsResult>("alicloud:bastionhost/getHosts:getHosts", args ?? new GetHostsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Bastionhost Hosts of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.135.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
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
        ///     var ids = AliCloud.BastionHost.GetHosts.Invoke(new()
        ///     {
        ///         InstanceId = "example_value",
        ///         Ids = new[]
        ///         {
        ///             "1",
        ///             "2",
        ///         },
        ///     });
        /// 
        ///     var nameRegex = AliCloud.BastionHost.GetHosts.Invoke(new()
        ///     {
        ///         InstanceId = "example_value",
        ///         NameRegex = "^my-Host",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["bastionhostHostId1"] = ids.Apply(getHostsResult =&gt; getHostsResult.Hosts[0]?.Id),
        ///         ["bastionhostHostId2"] = nameRegex.Apply(getHostsResult =&gt; getHostsResult.Hosts[0]?.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetHostsResult> Invoke(GetHostsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetHostsResult>("alicloud:bastionhost/getHosts:getHosts", args ?? new GetHostsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetHostsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Default to `false`. Set it to `true` can output more details about resource attributes.
        /// </summary>
        [Input("enableDetails")]
        public bool? EnableDetails { get; set; }

        /// <summary>
        /// The host address.
        /// </summary>
        [Input("hostAddress")]
        public string? HostAddress { get; set; }

        /// <summary>
        /// Specify the new create a host name of the supports up to 128 characters.
        /// </summary>
        [Input("hostName")]
        public string? HostName { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Host IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// Specify the new create a host where the Bastion host ID of.
        /// </summary>
        [Input("instanceId", required: true)]
        public string InstanceId { get; set; } = null!;

        /// <summary>
        /// A regex string to filter results by Host name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// Specify the new create the host's operating system. Valid values: Linux Windows.
        /// </summary>
        [Input("osType")]
        public string? OsType { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// Specify the new create a host of source. Valid values: Local: localhost Ecs:ECS instance Rds:RDS exclusive cluster host.
        /// </summary>
        [Input("source")]
        public string? Source { get; set; }

        /// <summary>
        /// Specify the newly created ECS instance ID or dedicated cluster host ID.
        /// </summary>
        [Input("sourceInstanceId")]
        public string? SourceInstanceId { get; set; }

        /// <summary>
        /// The source instance state.
        /// </summary>
        [Input("sourceInstanceState")]
        public string? SourceInstanceState { get; set; }

        public GetHostsArgs()
        {
        }
        public static new GetHostsArgs Empty => new GetHostsArgs();
    }

    public sealed class GetHostsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Default to `false`. Set it to `true` can output more details about resource attributes.
        /// </summary>
        [Input("enableDetails")]
        public Input<bool>? EnableDetails { get; set; }

        /// <summary>
        /// The host address.
        /// </summary>
        [Input("hostAddress")]
        public Input<string>? HostAddress { get; set; }

        /// <summary>
        /// Specify the new create a host name of the supports up to 128 characters.
        /// </summary>
        [Input("hostName")]
        public Input<string>? HostName { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Host IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// Specify the new create a host where the Bastion host ID of.
        /// </summary>
        [Input("instanceId", required: true)]
        public Input<string> InstanceId { get; set; } = null!;

        /// <summary>
        /// A regex string to filter results by Host name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// Specify the new create the host's operating system. Valid values: Linux Windows.
        /// </summary>
        [Input("osType")]
        public Input<string>? OsType { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// Specify the new create a host of source. Valid values: Local: localhost Ecs:ECS instance Rds:RDS exclusive cluster host.
        /// </summary>
        [Input("source")]
        public Input<string>? Source { get; set; }

        /// <summary>
        /// Specify the newly created ECS instance ID or dedicated cluster host ID.
        /// </summary>
        [Input("sourceInstanceId")]
        public Input<string>? SourceInstanceId { get; set; }

        /// <summary>
        /// The source instance state.
        /// </summary>
        [Input("sourceInstanceState")]
        public Input<string>? SourceInstanceState { get; set; }

        public GetHostsInvokeArgs()
        {
        }
        public static new GetHostsInvokeArgs Empty => new GetHostsInvokeArgs();
    }


    [OutputType]
    public sealed class GetHostsResult
    {
        public readonly bool? EnableDetails;
        public readonly string? HostAddress;
        public readonly string? HostName;
        public readonly ImmutableArray<Outputs.GetHostsHostResult> Hosts;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string InstanceId;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OsType;
        public readonly string? OutputFile;
        public readonly string? Source;
        public readonly string? SourceInstanceId;
        public readonly string? SourceInstanceState;

        [OutputConstructor]
        private GetHostsResult(
            bool? enableDetails,

            string? hostAddress,

            string? hostName,

            ImmutableArray<Outputs.GetHostsHostResult> hosts,

            string id,

            ImmutableArray<string> ids,

            string instanceId,

            string? nameRegex,

            ImmutableArray<string> names,

            string? osType,

            string? outputFile,

            string? source,

            string? sourceInstanceId,

            string? sourceInstanceState)
        {
            EnableDetails = enableDetails;
            HostAddress = hostAddress;
            HostName = hostName;
            Hosts = hosts;
            Id = id;
            Ids = ids;
            InstanceId = instanceId;
            NameRegex = nameRegex;
            Names = names;
            OsType = osType;
            OutputFile = outputFile;
            Source = source;
            SourceInstanceId = sourceInstanceId;
            SourceInstanceState = sourceInstanceState;
        }
    }
}
