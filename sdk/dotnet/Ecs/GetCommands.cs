// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ecs
{
    public static class GetCommands
    {
        /// <summary>
        /// This data source provides the Ecs Commands of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.116.0+.
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
        ///     var example = AliCloud.Ecs.GetCommands.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "E2RY53-xxxx",
        ///         },
        ///         NameRegex = "tf-testAcc",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstEcsCommandId"] = example.Apply(getCommandsResult =&gt; getCommandsResult.Commands[0]?.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetCommandsResult> InvokeAsync(GetCommandsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCommandsResult>("alicloud:ecs/getCommands:getCommands", args ?? new GetCommandsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Ecs Commands of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.116.0+.
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
        ///     var example = AliCloud.Ecs.GetCommands.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "E2RY53-xxxx",
        ///         },
        ///         NameRegex = "tf-testAcc",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstEcsCommandId"] = example.Apply(getCommandsResult =&gt; getCommandsResult.Commands[0]?.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetCommandsResult> Invoke(GetCommandsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCommandsResult>("alicloud:ecs/getCommands:getCommands", args ?? new GetCommandsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCommandsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Public order provider.
        /// </summary>
        [Input("commandProvider")]
        public string? CommandProvider { get; set; }

        /// <summary>
        /// The Base64-encoded content of the command.
        /// </summary>
        [Input("contentEncoding")]
        public string? ContentEncoding { get; set; }

        /// <summary>
        /// The description of command.
        /// </summary>
        [Input("description")]
        public string? Description { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Command IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The name of the command
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// A regex string to filter results by Command name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The command type.
        /// </summary>
        [Input("type")]
        public string? Type { get; set; }

        public GetCommandsArgs()
        {
        }
        public static new GetCommandsArgs Empty => new GetCommandsArgs();
    }

    public sealed class GetCommandsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Public order provider.
        /// </summary>
        [Input("commandProvider")]
        public Input<string>? CommandProvider { get; set; }

        /// <summary>
        /// The Base64-encoded content of the command.
        /// </summary>
        [Input("contentEncoding")]
        public Input<string>? ContentEncoding { get; set; }

        /// <summary>
        /// The description of command.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Command IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The name of the command
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// A regex string to filter results by Command name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The command type.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public GetCommandsInvokeArgs()
        {
        }
        public static new GetCommandsInvokeArgs Empty => new GetCommandsInvokeArgs();
    }


    [OutputType]
    public sealed class GetCommandsResult
    {
        public readonly string? CommandProvider;
        public readonly ImmutableArray<Outputs.GetCommandsCommandResult> Commands;
        public readonly string? ContentEncoding;
        public readonly string? Description;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? Name;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly string? Type;

        [OutputConstructor]
        private GetCommandsResult(
            string? commandProvider,

            ImmutableArray<Outputs.GetCommandsCommandResult> commands,

            string? contentEncoding,

            string? description,

            string id,

            ImmutableArray<string> ids,

            string? name,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            string? type)
        {
            CommandProvider = commandProvider;
            Commands = commands;
            ContentEncoding = contentEncoding;
            Description = description;
            Id = id;
            Ids = ids;
            Name = name;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            Type = type;
        }
    }
}
