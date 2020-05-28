// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Nas
{
    public static class GetFileSystems
    {
        /// <summary>
        /// This data source provides FileSystems available to the user.
        /// 
        /// &gt; NOTE: Available in 1.35.0+
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var fs = Output.Create(AliCloud.Nas.GetFileSystems.InvokeAsync(new AliCloud.Nas.GetFileSystemsArgs
        ///         {
        ///             Description = alicloud_nas_file_system.Foo.Description,
        ///             ProtocolType = "NFS",
        ///         }));
        ///         this.AlicloudNasFileSystemsId = fs.Apply(fs =&gt; fs.Systems[0].Id);
        ///     }
        /// 
        ///     [Output("alicloudNasFileSystemsId")]
        ///     public Output&lt;string&gt; AlicloudNasFileSystemsId { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetFileSystemsResult> InvokeAsync(GetFileSystemsArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetFileSystemsResult>("alicloud:nas/getFileSystems:getFileSystems", args ?? new GetFileSystemsArgs(), options.WithVersion());
    }


    public sealed class GetFileSystemsArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// A regex string to filter the results by the ：FileSystem description.
        /// </summary>
        [Input("descriptionRegex")]
        public string? DescriptionRegex { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of FileSystemId.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// Filter results by a specific ProtocolType. 
        /// </summary>
        [Input("protocolType")]
        public string? ProtocolType { get; set; }

        /// <summary>
        /// Filter results by a specific StorageType. 
        /// </summary>
        [Input("storageType")]
        public string? StorageType { get; set; }

        public GetFileSystemsArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetFileSystemsResult
    {
        public readonly string? DescriptionRegex;
        /// <summary>
        /// A list of FileSystem descriptions.
        /// </summary>
        public readonly ImmutableArray<string> Descriptions;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of FileSystem Id.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly string? OutputFile;
        /// <summary>
        /// ProtocolType block of the FileSystem
        /// </summary>
        public readonly string? ProtocolType;
        /// <summary>
        /// StorageType block of the FileSystem.
        /// </summary>
        public readonly string? StorageType;
        /// <summary>
        /// A list of VPCs. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetFileSystemsSystemResult> Systems;

        [OutputConstructor]
        private GetFileSystemsResult(
            string? descriptionRegex,

            ImmutableArray<string> descriptions,

            string id,

            ImmutableArray<string> ids,

            string? outputFile,

            string? protocolType,

            string? storageType,

            ImmutableArray<Outputs.GetFileSystemsSystemResult> systems)
        {
            DescriptionRegex = descriptionRegex;
            Descriptions = descriptions;
            Id = id;
            Ids = ids;
            OutputFile = outputFile;
            ProtocolType = protocolType;
            StorageType = storageType;
            Systems = systems;
        }
    }
}
