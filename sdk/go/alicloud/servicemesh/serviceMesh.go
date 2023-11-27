// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package servicemesh

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Service Mesh Service Mesh resource.
//
// For information about Service Mesh Service Mesh and how to use it, see [What is Service Mesh](https://www.alibabacloud.com/help/en/asm/developer-reference/api-servicemesh-2020-01-11-createservicemesh).
//
// > **NOTE:** Available since v1.138.0.
//
// ## Import
//
// Service Mesh Service Mesh can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:servicemesh/serviceMesh:ServiceMesh example <id>
//
// ```
type ServiceMesh struct {
	pulumi.CustomResourceState

	// List of clusters.
	ClusterIds pulumi.StringArrayOutput `pulumi:"clusterIds"`
	// Cluster specification. The service mesh instance specification. Valid values: `standard`,`enterprise`,`ultimate`. Default to `standard`.
	ClusterSpec pulumi.StringOutput `pulumi:"clusterSpec"`
	// Service grid creation time.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// Whether to customize Prometheus. Value:
	// -'true': custom Prometheus.
	// -'false': Do not customize Prometheus. Default value: 'false '.
	CustomizedPrometheus pulumi.BoolPtrOutput `pulumi:"customizedPrometheus"`
	// Grid instance version type. Valid values: `Default` and `Pro`. Default: the standard. Pro: the Pro version.
	Edition pulumi.StringOutput `pulumi:"edition"`
	// Data plane KubeAPI access capability. See `extraConfiguration` below.
	ExtraConfiguration ServiceMeshExtraConfigurationOutput `pulumi:"extraConfiguration"`
	// Whether to forcibly delete the ASM instance. Value:
	// -'true': force deletion of ASM instance
	// -'false': no forced deletion of ASM instance. Default value: false.
	Force pulumi.BoolPtrOutput `pulumi:"force"`
	// Load balancing information. See `loadBalancer` below.
	LoadBalancer ServiceMeshLoadBalancerOutput `pulumi:"loadBalancer"`
	// Service grid configuration information. See `meshConfig` below.
	MeshConfig ServiceMeshMeshConfigOutput `pulumi:"meshConfig"`
	// Service grid network configuration information. See `network` below.
	Network ServiceMeshNetworkOutput `pulumi:"network"`
	// The Prometheus service address (in non-custom cases, use the ARMS address format).
	PrometheusUrl pulumi.StringPtrOutput `pulumi:"prometheusUrl"`
	// ServiceMeshName.
	ServiceMeshName pulumi.StringPtrOutput `pulumi:"serviceMeshName"`
	// The status of the resource.
	Status pulumi.StringOutput `pulumi:"status"`
	// The tag of the resource.
	Tags pulumi.MapOutput `pulumi:"tags"`
	// Service grid version number. The version of the resource. you can look up the version using alicloud_service_mesh_versions. Note: The version supports updating from v1.170.0, the relevant version can be obtained via istioOperatorVersion in `servicemesh.getServiceMeshes`.
	Version pulumi.StringOutput `pulumi:"version"`
}

// NewServiceMesh registers a new resource with the given unique name, arguments, and options.
func NewServiceMesh(ctx *pulumi.Context,
	name string, args *ServiceMeshArgs, opts ...pulumi.ResourceOption) (*ServiceMesh, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Network == nil {
		return nil, errors.New("invalid value for required argument 'Network'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ServiceMesh
	err := ctx.RegisterResource("alicloud:servicemesh/serviceMesh:ServiceMesh", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetServiceMesh gets an existing ServiceMesh resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetServiceMesh(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ServiceMeshState, opts ...pulumi.ResourceOption) (*ServiceMesh, error) {
	var resource ServiceMesh
	err := ctx.ReadResource("alicloud:servicemesh/serviceMesh:ServiceMesh", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ServiceMesh resources.
type serviceMeshState struct {
	// List of clusters.
	ClusterIds []string `pulumi:"clusterIds"`
	// Cluster specification. The service mesh instance specification. Valid values: `standard`,`enterprise`,`ultimate`. Default to `standard`.
	ClusterSpec *string `pulumi:"clusterSpec"`
	// Service grid creation time.
	CreateTime *string `pulumi:"createTime"`
	// Whether to customize Prometheus. Value:
	// -'true': custom Prometheus.
	// -'false': Do not customize Prometheus. Default value: 'false '.
	CustomizedPrometheus *bool `pulumi:"customizedPrometheus"`
	// Grid instance version type. Valid values: `Default` and `Pro`. Default: the standard. Pro: the Pro version.
	Edition *string `pulumi:"edition"`
	// Data plane KubeAPI access capability. See `extraConfiguration` below.
	ExtraConfiguration *ServiceMeshExtraConfiguration `pulumi:"extraConfiguration"`
	// Whether to forcibly delete the ASM instance. Value:
	// -'true': force deletion of ASM instance
	// -'false': no forced deletion of ASM instance. Default value: false.
	Force *bool `pulumi:"force"`
	// Load balancing information. See `loadBalancer` below.
	LoadBalancer *ServiceMeshLoadBalancer `pulumi:"loadBalancer"`
	// Service grid configuration information. See `meshConfig` below.
	MeshConfig *ServiceMeshMeshConfig `pulumi:"meshConfig"`
	// Service grid network configuration information. See `network` below.
	Network *ServiceMeshNetwork `pulumi:"network"`
	// The Prometheus service address (in non-custom cases, use the ARMS address format).
	PrometheusUrl *string `pulumi:"prometheusUrl"`
	// ServiceMeshName.
	ServiceMeshName *string `pulumi:"serviceMeshName"`
	// The status of the resource.
	Status *string `pulumi:"status"`
	// The tag of the resource.
	Tags map[string]interface{} `pulumi:"tags"`
	// Service grid version number. The version of the resource. you can look up the version using alicloud_service_mesh_versions. Note: The version supports updating from v1.170.0, the relevant version can be obtained via istioOperatorVersion in `servicemesh.getServiceMeshes`.
	Version *string `pulumi:"version"`
}

type ServiceMeshState struct {
	// List of clusters.
	ClusterIds pulumi.StringArrayInput
	// Cluster specification. The service mesh instance specification. Valid values: `standard`,`enterprise`,`ultimate`. Default to `standard`.
	ClusterSpec pulumi.StringPtrInput
	// Service grid creation time.
	CreateTime pulumi.StringPtrInput
	// Whether to customize Prometheus. Value:
	// -'true': custom Prometheus.
	// -'false': Do not customize Prometheus. Default value: 'false '.
	CustomizedPrometheus pulumi.BoolPtrInput
	// Grid instance version type. Valid values: `Default` and `Pro`. Default: the standard. Pro: the Pro version.
	Edition pulumi.StringPtrInput
	// Data plane KubeAPI access capability. See `extraConfiguration` below.
	ExtraConfiguration ServiceMeshExtraConfigurationPtrInput
	// Whether to forcibly delete the ASM instance. Value:
	// -'true': force deletion of ASM instance
	// -'false': no forced deletion of ASM instance. Default value: false.
	Force pulumi.BoolPtrInput
	// Load balancing information. See `loadBalancer` below.
	LoadBalancer ServiceMeshLoadBalancerPtrInput
	// Service grid configuration information. See `meshConfig` below.
	MeshConfig ServiceMeshMeshConfigPtrInput
	// Service grid network configuration information. See `network` below.
	Network ServiceMeshNetworkPtrInput
	// The Prometheus service address (in non-custom cases, use the ARMS address format).
	PrometheusUrl pulumi.StringPtrInput
	// ServiceMeshName.
	ServiceMeshName pulumi.StringPtrInput
	// The status of the resource.
	Status pulumi.StringPtrInput
	// The tag of the resource.
	Tags pulumi.MapInput
	// Service grid version number. The version of the resource. you can look up the version using alicloud_service_mesh_versions. Note: The version supports updating from v1.170.0, the relevant version can be obtained via istioOperatorVersion in `servicemesh.getServiceMeshes`.
	Version pulumi.StringPtrInput
}

func (ServiceMeshState) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceMeshState)(nil)).Elem()
}

type serviceMeshArgs struct {
	// List of clusters.
	ClusterIds []string `pulumi:"clusterIds"`
	// Cluster specification. The service mesh instance specification. Valid values: `standard`,`enterprise`,`ultimate`. Default to `standard`.
	ClusterSpec *string `pulumi:"clusterSpec"`
	// Whether to customize Prometheus. Value:
	// -'true': custom Prometheus.
	// -'false': Do not customize Prometheus. Default value: 'false '.
	CustomizedPrometheus *bool `pulumi:"customizedPrometheus"`
	// Grid instance version type. Valid values: `Default` and `Pro`. Default: the standard. Pro: the Pro version.
	Edition *string `pulumi:"edition"`
	// Data plane KubeAPI access capability. See `extraConfiguration` below.
	ExtraConfiguration *ServiceMeshExtraConfiguration `pulumi:"extraConfiguration"`
	// Whether to forcibly delete the ASM instance. Value:
	// -'true': force deletion of ASM instance
	// -'false': no forced deletion of ASM instance. Default value: false.
	Force *bool `pulumi:"force"`
	// Load balancing information. See `loadBalancer` below.
	LoadBalancer *ServiceMeshLoadBalancer `pulumi:"loadBalancer"`
	// Service grid configuration information. See `meshConfig` below.
	MeshConfig *ServiceMeshMeshConfig `pulumi:"meshConfig"`
	// Service grid network configuration information. See `network` below.
	Network ServiceMeshNetwork `pulumi:"network"`
	// The Prometheus service address (in non-custom cases, use the ARMS address format).
	PrometheusUrl *string `pulumi:"prometheusUrl"`
	// ServiceMeshName.
	ServiceMeshName *string `pulumi:"serviceMeshName"`
	// The tag of the resource.
	Tags map[string]interface{} `pulumi:"tags"`
	// Service grid version number. The version of the resource. you can look up the version using alicloud_service_mesh_versions. Note: The version supports updating from v1.170.0, the relevant version can be obtained via istioOperatorVersion in `servicemesh.getServiceMeshes`.
	Version *string `pulumi:"version"`
}

// The set of arguments for constructing a ServiceMesh resource.
type ServiceMeshArgs struct {
	// List of clusters.
	ClusterIds pulumi.StringArrayInput
	// Cluster specification. The service mesh instance specification. Valid values: `standard`,`enterprise`,`ultimate`. Default to `standard`.
	ClusterSpec pulumi.StringPtrInput
	// Whether to customize Prometheus. Value:
	// -'true': custom Prometheus.
	// -'false': Do not customize Prometheus. Default value: 'false '.
	CustomizedPrometheus pulumi.BoolPtrInput
	// Grid instance version type. Valid values: `Default` and `Pro`. Default: the standard. Pro: the Pro version.
	Edition pulumi.StringPtrInput
	// Data plane KubeAPI access capability. See `extraConfiguration` below.
	ExtraConfiguration ServiceMeshExtraConfigurationPtrInput
	// Whether to forcibly delete the ASM instance. Value:
	// -'true': force deletion of ASM instance
	// -'false': no forced deletion of ASM instance. Default value: false.
	Force pulumi.BoolPtrInput
	// Load balancing information. See `loadBalancer` below.
	LoadBalancer ServiceMeshLoadBalancerPtrInput
	// Service grid configuration information. See `meshConfig` below.
	MeshConfig ServiceMeshMeshConfigPtrInput
	// Service grid network configuration information. See `network` below.
	Network ServiceMeshNetworkInput
	// The Prometheus service address (in non-custom cases, use the ARMS address format).
	PrometheusUrl pulumi.StringPtrInput
	// ServiceMeshName.
	ServiceMeshName pulumi.StringPtrInput
	// The tag of the resource.
	Tags pulumi.MapInput
	// Service grid version number. The version of the resource. you can look up the version using alicloud_service_mesh_versions. Note: The version supports updating from v1.170.0, the relevant version can be obtained via istioOperatorVersion in `servicemesh.getServiceMeshes`.
	Version pulumi.StringPtrInput
}

func (ServiceMeshArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceMeshArgs)(nil)).Elem()
}

type ServiceMeshInput interface {
	pulumi.Input

	ToServiceMeshOutput() ServiceMeshOutput
	ToServiceMeshOutputWithContext(ctx context.Context) ServiceMeshOutput
}

func (*ServiceMesh) ElementType() reflect.Type {
	return reflect.TypeOf((**ServiceMesh)(nil)).Elem()
}

func (i *ServiceMesh) ToServiceMeshOutput() ServiceMeshOutput {
	return i.ToServiceMeshOutputWithContext(context.Background())
}

func (i *ServiceMesh) ToServiceMeshOutputWithContext(ctx context.Context) ServiceMeshOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceMeshOutput)
}

// ServiceMeshArrayInput is an input type that accepts ServiceMeshArray and ServiceMeshArrayOutput values.
// You can construct a concrete instance of `ServiceMeshArrayInput` via:
//
//	ServiceMeshArray{ ServiceMeshArgs{...} }
type ServiceMeshArrayInput interface {
	pulumi.Input

	ToServiceMeshArrayOutput() ServiceMeshArrayOutput
	ToServiceMeshArrayOutputWithContext(context.Context) ServiceMeshArrayOutput
}

type ServiceMeshArray []ServiceMeshInput

func (ServiceMeshArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServiceMesh)(nil)).Elem()
}

func (i ServiceMeshArray) ToServiceMeshArrayOutput() ServiceMeshArrayOutput {
	return i.ToServiceMeshArrayOutputWithContext(context.Background())
}

func (i ServiceMeshArray) ToServiceMeshArrayOutputWithContext(ctx context.Context) ServiceMeshArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceMeshArrayOutput)
}

// ServiceMeshMapInput is an input type that accepts ServiceMeshMap and ServiceMeshMapOutput values.
// You can construct a concrete instance of `ServiceMeshMapInput` via:
//
//	ServiceMeshMap{ "key": ServiceMeshArgs{...} }
type ServiceMeshMapInput interface {
	pulumi.Input

	ToServiceMeshMapOutput() ServiceMeshMapOutput
	ToServiceMeshMapOutputWithContext(context.Context) ServiceMeshMapOutput
}

type ServiceMeshMap map[string]ServiceMeshInput

func (ServiceMeshMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServiceMesh)(nil)).Elem()
}

func (i ServiceMeshMap) ToServiceMeshMapOutput() ServiceMeshMapOutput {
	return i.ToServiceMeshMapOutputWithContext(context.Background())
}

func (i ServiceMeshMap) ToServiceMeshMapOutputWithContext(ctx context.Context) ServiceMeshMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceMeshMapOutput)
}

type ServiceMeshOutput struct{ *pulumi.OutputState }

func (ServiceMeshOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ServiceMesh)(nil)).Elem()
}

func (o ServiceMeshOutput) ToServiceMeshOutput() ServiceMeshOutput {
	return o
}

func (o ServiceMeshOutput) ToServiceMeshOutputWithContext(ctx context.Context) ServiceMeshOutput {
	return o
}

// List of clusters.
func (o ServiceMeshOutput) ClusterIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ServiceMesh) pulumi.StringArrayOutput { return v.ClusterIds }).(pulumi.StringArrayOutput)
}

// Cluster specification. The service mesh instance specification. Valid values: `standard`,`enterprise`,`ultimate`. Default to `standard`.
func (o ServiceMeshOutput) ClusterSpec() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceMesh) pulumi.StringOutput { return v.ClusterSpec }).(pulumi.StringOutput)
}

// Service grid creation time.
func (o ServiceMeshOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceMesh) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// Whether to customize Prometheus. Value:
// -'true': custom Prometheus.
// -'false': Do not customize Prometheus. Default value: 'false '.
func (o ServiceMeshOutput) CustomizedPrometheus() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ServiceMesh) pulumi.BoolPtrOutput { return v.CustomizedPrometheus }).(pulumi.BoolPtrOutput)
}

// Grid instance version type. Valid values: `Default` and `Pro`. Default: the standard. Pro: the Pro version.
func (o ServiceMeshOutput) Edition() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceMesh) pulumi.StringOutput { return v.Edition }).(pulumi.StringOutput)
}

// Data plane KubeAPI access capability. See `extraConfiguration` below.
func (o ServiceMeshOutput) ExtraConfiguration() ServiceMeshExtraConfigurationOutput {
	return o.ApplyT(func(v *ServiceMesh) ServiceMeshExtraConfigurationOutput { return v.ExtraConfiguration }).(ServiceMeshExtraConfigurationOutput)
}

// Whether to forcibly delete the ASM instance. Value:
// -'true': force deletion of ASM instance
// -'false': no forced deletion of ASM instance. Default value: false.
func (o ServiceMeshOutput) Force() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ServiceMesh) pulumi.BoolPtrOutput { return v.Force }).(pulumi.BoolPtrOutput)
}

// Load balancing information. See `loadBalancer` below.
func (o ServiceMeshOutput) LoadBalancer() ServiceMeshLoadBalancerOutput {
	return o.ApplyT(func(v *ServiceMesh) ServiceMeshLoadBalancerOutput { return v.LoadBalancer }).(ServiceMeshLoadBalancerOutput)
}

// Service grid configuration information. See `meshConfig` below.
func (o ServiceMeshOutput) MeshConfig() ServiceMeshMeshConfigOutput {
	return o.ApplyT(func(v *ServiceMesh) ServiceMeshMeshConfigOutput { return v.MeshConfig }).(ServiceMeshMeshConfigOutput)
}

// Service grid network configuration information. See `network` below.
func (o ServiceMeshOutput) Network() ServiceMeshNetworkOutput {
	return o.ApplyT(func(v *ServiceMesh) ServiceMeshNetworkOutput { return v.Network }).(ServiceMeshNetworkOutput)
}

// The Prometheus service address (in non-custom cases, use the ARMS address format).
func (o ServiceMeshOutput) PrometheusUrl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceMesh) pulumi.StringPtrOutput { return v.PrometheusUrl }).(pulumi.StringPtrOutput)
}

// ServiceMeshName.
func (o ServiceMeshOutput) ServiceMeshName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceMesh) pulumi.StringPtrOutput { return v.ServiceMeshName }).(pulumi.StringPtrOutput)
}

// The status of the resource.
func (o ServiceMeshOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceMesh) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The tag of the resource.
func (o ServiceMeshOutput) Tags() pulumi.MapOutput {
	return o.ApplyT(func(v *ServiceMesh) pulumi.MapOutput { return v.Tags }).(pulumi.MapOutput)
}

// Service grid version number. The version of the resource. you can look up the version using alicloud_service_mesh_versions. Note: The version supports updating from v1.170.0, the relevant version can be obtained via istioOperatorVersion in `servicemesh.getServiceMeshes`.
func (o ServiceMeshOutput) Version() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceMesh) pulumi.StringOutput { return v.Version }).(pulumi.StringOutput)
}

type ServiceMeshArrayOutput struct{ *pulumi.OutputState }

func (ServiceMeshArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServiceMesh)(nil)).Elem()
}

func (o ServiceMeshArrayOutput) ToServiceMeshArrayOutput() ServiceMeshArrayOutput {
	return o
}

func (o ServiceMeshArrayOutput) ToServiceMeshArrayOutputWithContext(ctx context.Context) ServiceMeshArrayOutput {
	return o
}

func (o ServiceMeshArrayOutput) Index(i pulumi.IntInput) ServiceMeshOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ServiceMesh {
		return vs[0].([]*ServiceMesh)[vs[1].(int)]
	}).(ServiceMeshOutput)
}

type ServiceMeshMapOutput struct{ *pulumi.OutputState }

func (ServiceMeshMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServiceMesh)(nil)).Elem()
}

func (o ServiceMeshMapOutput) ToServiceMeshMapOutput() ServiceMeshMapOutput {
	return o
}

func (o ServiceMeshMapOutput) ToServiceMeshMapOutputWithContext(ctx context.Context) ServiceMeshMapOutput {
	return o
}

func (o ServiceMeshMapOutput) MapIndex(k pulumi.StringInput) ServiceMeshOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ServiceMesh {
		return vs[0].(map[string]*ServiceMesh)[vs[1].(string)]
	}).(ServiceMeshOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceMeshInput)(nil)).Elem(), &ServiceMesh{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceMeshArrayInput)(nil)).Elem(), ServiceMeshArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceMeshMapInput)(nil)).Elem(), ServiceMeshMap{})
	pulumi.RegisterOutputType(ServiceMeshOutput{})
	pulumi.RegisterOutputType(ServiceMeshArrayOutput{})
	pulumi.RegisterOutputType(ServiceMeshMapOutput{})
}
