// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cloudstoragegateway

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Cloud Storage Gateway Express Sync resource.
//
// For information about Cloud Storage Gateway Express Sync and how to use it, see [What is Express Sync](https://www.alibabacloud.com/help/en/doc-detail/53972.htm).
//
// > **NOTE:** Available in v1.144.0+.
//
// ## Example Usage
//
// Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/cloudstoragegateway"
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/oss"
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		cfg := config.New(ctx, "")
// 		name := "tftest"
// 		if param := cfg.Get("name"); param != "" {
// 			name = param
// 		}
// 		region := "cn-shanghai"
// 		if param := cfg.Get("region"); param != "" {
// 			region = param
// 		}
// 		opt0 := "Standard"
// 		defaultStocks, err := cloudstoragegateway.GetStocks(ctx, &cloudstoragegateway.GetStocksArgs{
// 			GatewayClass: &opt0,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		vpc, err := vpc.NewNetwork(ctx, "vpc", &vpc.NetworkArgs{
// 			VpcName:   pulumi.String(name),
// 			CidrBlock: pulumi.String("172.16.0.0/12"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		defaultSwitch, err := vpc.NewSwitch(ctx, "defaultSwitch", &vpc.SwitchArgs{
// 			VpcId:       vpc.ID(),
// 			CidrBlock:   pulumi.String("172.16.0.0/21"),
// 			ZoneId:      pulumi.String(defaultStocks.Stocks[0].ZoneId),
// 			VswitchName: pulumi.String(name),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		defaultStorageBundle, err := cloudstoragegateway.NewStorageBundle(ctx, "defaultStorageBundle", &cloudstoragegateway.StorageBundleArgs{
// 			StorageBundleName: pulumi.String(name),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		defaultGateway, err := cloudstoragegateway.NewGateway(ctx, "defaultGateway", &cloudstoragegateway.GatewayArgs{
// 			Description:            pulumi.String("tf-acctestDesalone"),
// 			GatewayClass:           pulumi.String("Standard"),
// 			Type:                   pulumi.String("File"),
// 			PaymentType:            pulumi.String("PayAsYouGo"),
// 			VswitchId:              defaultSwitch.ID(),
// 			ReleaseAfterExpiration: pulumi.Bool(true),
// 			PublicNetworkBandwidth: pulumi.Int(10),
// 			StorageBundleId:        defaultStorageBundle.ID(),
// 			Location:               pulumi.String("Cloud"),
// 			GatewayName:            pulumi.String(name),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		defaultGatewayCacheDisk, err := cloudstoragegateway.NewGatewayCacheDisk(ctx, "defaultGatewayCacheDisk", &cloudstoragegateway.GatewayCacheDiskArgs{
// 			CacheDiskCategory: pulumi.String("cloud_efficiency"),
// 			GatewayId:         defaultGateway.ID(),
// 			CacheDiskSizeInGb: pulumi.Int(50),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		defaultBucket, err := oss.NewBucket(ctx, "defaultBucket", &oss.BucketArgs{
// 			Bucket: pulumi.String(name),
// 			Acl:    pulumi.String("public-read-write"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		defaultGatewayFileShare, err := cloudstoragegateway.NewGatewayFileShare(ctx, "defaultGatewayFileShare", &cloudstoragegateway.GatewayFileShareArgs{
// 			GatewayFileShareName: pulumi.String(name),
// 			GatewayId:            defaultGateway.ID(),
// 			LocalPath:            defaultGatewayCacheDisk.LocalFilePath,
// 			OssBucketName:        defaultBucket.Bucket,
// 			OssEndpoint:          defaultBucket.ExtranetEndpoint,
// 			Protocol:             pulumi.String("NFS"),
// 			RemoteSync:           pulumi.Bool(true),
// 			PollingInterval:      pulumi.Int(4500),
// 			FeLimit:              pulumi.Int(0),
// 			BackendLimit:         pulumi.Int(0),
// 			CacheMode:            pulumi.String("Cache"),
// 			Squash:               pulumi.String("none"),
// 			LagPeriod:            pulumi.Int(5),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = cloudstoragegateway.NewExpressSync(ctx, "defaultExpressSync", &cloudstoragegateway.ExpressSyncArgs{
// 			BucketName:      defaultGatewayFileShare.OssBucketName,
// 			BucketRegion:    pulumi.String(region),
// 			Description:     pulumi.String(name),
// 			ExpressSyncName: pulumi.String(name),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// Cloud Storage Gateway Express Sync can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:cloudstoragegateway/expressSync:ExpressSync example <id>
// ```
type ExpressSync struct {
	pulumi.CustomResourceState

	// The name of the OSS Bucket.
	BucketName pulumi.StringOutput `pulumi:"bucketName"`
	// The prefix of the OSS Bucket.
	BucketPrefix pulumi.StringPtrOutput `pulumi:"bucketPrefix"`
	// The region of the OSS Bucket.
	BucketRegion pulumi.StringOutput `pulumi:"bucketRegion"`
	// The description of the Express Sync. The length of the name is limited to `1` to `255` characters.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The name of the ExpressSync. The length of the name is limited to `1` to `128` characters. It can contain uppercase and lowercase letters, Chinese characters, numbers, English periods (.), underscores (_), or hyphens (-), and must start with  letters.
	ExpressSyncName pulumi.StringOutput `pulumi:"expressSyncName"`
}

// NewExpressSync registers a new resource with the given unique name, arguments, and options.
func NewExpressSync(ctx *pulumi.Context,
	name string, args *ExpressSyncArgs, opts ...pulumi.ResourceOption) (*ExpressSync, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.BucketName == nil {
		return nil, errors.New("invalid value for required argument 'BucketName'")
	}
	if args.BucketRegion == nil {
		return nil, errors.New("invalid value for required argument 'BucketRegion'")
	}
	if args.ExpressSyncName == nil {
		return nil, errors.New("invalid value for required argument 'ExpressSyncName'")
	}
	var resource ExpressSync
	err := ctx.RegisterResource("alicloud:cloudstoragegateway/expressSync:ExpressSync", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetExpressSync gets an existing ExpressSync resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetExpressSync(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ExpressSyncState, opts ...pulumi.ResourceOption) (*ExpressSync, error) {
	var resource ExpressSync
	err := ctx.ReadResource("alicloud:cloudstoragegateway/expressSync:ExpressSync", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ExpressSync resources.
type expressSyncState struct {
	// The name of the OSS Bucket.
	BucketName *string `pulumi:"bucketName"`
	// The prefix of the OSS Bucket.
	BucketPrefix *string `pulumi:"bucketPrefix"`
	// The region of the OSS Bucket.
	BucketRegion *string `pulumi:"bucketRegion"`
	// The description of the Express Sync. The length of the name is limited to `1` to `255` characters.
	Description *string `pulumi:"description"`
	// The name of the ExpressSync. The length of the name is limited to `1` to `128` characters. It can contain uppercase and lowercase letters, Chinese characters, numbers, English periods (.), underscores (_), or hyphens (-), and must start with  letters.
	ExpressSyncName *string `pulumi:"expressSyncName"`
}

type ExpressSyncState struct {
	// The name of the OSS Bucket.
	BucketName pulumi.StringPtrInput
	// The prefix of the OSS Bucket.
	BucketPrefix pulumi.StringPtrInput
	// The region of the OSS Bucket.
	BucketRegion pulumi.StringPtrInput
	// The description of the Express Sync. The length of the name is limited to `1` to `255` characters.
	Description pulumi.StringPtrInput
	// The name of the ExpressSync. The length of the name is limited to `1` to `128` characters. It can contain uppercase and lowercase letters, Chinese characters, numbers, English periods (.), underscores (_), or hyphens (-), and must start with  letters.
	ExpressSyncName pulumi.StringPtrInput
}

func (ExpressSyncState) ElementType() reflect.Type {
	return reflect.TypeOf((*expressSyncState)(nil)).Elem()
}

type expressSyncArgs struct {
	// The name of the OSS Bucket.
	BucketName string `pulumi:"bucketName"`
	// The prefix of the OSS Bucket.
	BucketPrefix *string `pulumi:"bucketPrefix"`
	// The region of the OSS Bucket.
	BucketRegion string `pulumi:"bucketRegion"`
	// The description of the Express Sync. The length of the name is limited to `1` to `255` characters.
	Description *string `pulumi:"description"`
	// The name of the ExpressSync. The length of the name is limited to `1` to `128` characters. It can contain uppercase and lowercase letters, Chinese characters, numbers, English periods (.), underscores (_), or hyphens (-), and must start with  letters.
	ExpressSyncName string `pulumi:"expressSyncName"`
}

// The set of arguments for constructing a ExpressSync resource.
type ExpressSyncArgs struct {
	// The name of the OSS Bucket.
	BucketName pulumi.StringInput
	// The prefix of the OSS Bucket.
	BucketPrefix pulumi.StringPtrInput
	// The region of the OSS Bucket.
	BucketRegion pulumi.StringInput
	// The description of the Express Sync. The length of the name is limited to `1` to `255` characters.
	Description pulumi.StringPtrInput
	// The name of the ExpressSync. The length of the name is limited to `1` to `128` characters. It can contain uppercase and lowercase letters, Chinese characters, numbers, English periods (.), underscores (_), or hyphens (-), and must start with  letters.
	ExpressSyncName pulumi.StringInput
}

func (ExpressSyncArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*expressSyncArgs)(nil)).Elem()
}

type ExpressSyncInput interface {
	pulumi.Input

	ToExpressSyncOutput() ExpressSyncOutput
	ToExpressSyncOutputWithContext(ctx context.Context) ExpressSyncOutput
}

func (*ExpressSync) ElementType() reflect.Type {
	return reflect.TypeOf((**ExpressSync)(nil)).Elem()
}

func (i *ExpressSync) ToExpressSyncOutput() ExpressSyncOutput {
	return i.ToExpressSyncOutputWithContext(context.Background())
}

func (i *ExpressSync) ToExpressSyncOutputWithContext(ctx context.Context) ExpressSyncOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ExpressSyncOutput)
}

// ExpressSyncArrayInput is an input type that accepts ExpressSyncArray and ExpressSyncArrayOutput values.
// You can construct a concrete instance of `ExpressSyncArrayInput` via:
//
//          ExpressSyncArray{ ExpressSyncArgs{...} }
type ExpressSyncArrayInput interface {
	pulumi.Input

	ToExpressSyncArrayOutput() ExpressSyncArrayOutput
	ToExpressSyncArrayOutputWithContext(context.Context) ExpressSyncArrayOutput
}

type ExpressSyncArray []ExpressSyncInput

func (ExpressSyncArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ExpressSync)(nil)).Elem()
}

func (i ExpressSyncArray) ToExpressSyncArrayOutput() ExpressSyncArrayOutput {
	return i.ToExpressSyncArrayOutputWithContext(context.Background())
}

func (i ExpressSyncArray) ToExpressSyncArrayOutputWithContext(ctx context.Context) ExpressSyncArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ExpressSyncArrayOutput)
}

// ExpressSyncMapInput is an input type that accepts ExpressSyncMap and ExpressSyncMapOutput values.
// You can construct a concrete instance of `ExpressSyncMapInput` via:
//
//          ExpressSyncMap{ "key": ExpressSyncArgs{...} }
type ExpressSyncMapInput interface {
	pulumi.Input

	ToExpressSyncMapOutput() ExpressSyncMapOutput
	ToExpressSyncMapOutputWithContext(context.Context) ExpressSyncMapOutput
}

type ExpressSyncMap map[string]ExpressSyncInput

func (ExpressSyncMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ExpressSync)(nil)).Elem()
}

func (i ExpressSyncMap) ToExpressSyncMapOutput() ExpressSyncMapOutput {
	return i.ToExpressSyncMapOutputWithContext(context.Background())
}

func (i ExpressSyncMap) ToExpressSyncMapOutputWithContext(ctx context.Context) ExpressSyncMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ExpressSyncMapOutput)
}

type ExpressSyncOutput struct{ *pulumi.OutputState }

func (ExpressSyncOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ExpressSync)(nil)).Elem()
}

func (o ExpressSyncOutput) ToExpressSyncOutput() ExpressSyncOutput {
	return o
}

func (o ExpressSyncOutput) ToExpressSyncOutputWithContext(ctx context.Context) ExpressSyncOutput {
	return o
}

type ExpressSyncArrayOutput struct{ *pulumi.OutputState }

func (ExpressSyncArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ExpressSync)(nil)).Elem()
}

func (o ExpressSyncArrayOutput) ToExpressSyncArrayOutput() ExpressSyncArrayOutput {
	return o
}

func (o ExpressSyncArrayOutput) ToExpressSyncArrayOutputWithContext(ctx context.Context) ExpressSyncArrayOutput {
	return o
}

func (o ExpressSyncArrayOutput) Index(i pulumi.IntInput) ExpressSyncOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ExpressSync {
		return vs[0].([]*ExpressSync)[vs[1].(int)]
	}).(ExpressSyncOutput)
}

type ExpressSyncMapOutput struct{ *pulumi.OutputState }

func (ExpressSyncMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ExpressSync)(nil)).Elem()
}

func (o ExpressSyncMapOutput) ToExpressSyncMapOutput() ExpressSyncMapOutput {
	return o
}

func (o ExpressSyncMapOutput) ToExpressSyncMapOutputWithContext(ctx context.Context) ExpressSyncMapOutput {
	return o
}

func (o ExpressSyncMapOutput) MapIndex(k pulumi.StringInput) ExpressSyncOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ExpressSync {
		return vs[0].(map[string]*ExpressSync)[vs[1].(string)]
	}).(ExpressSyncOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ExpressSyncInput)(nil)).Elem(), &ExpressSync{})
	pulumi.RegisterInputType(reflect.TypeOf((*ExpressSyncArrayInput)(nil)).Elem(), ExpressSyncArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ExpressSyncMapInput)(nil)).Elem(), ExpressSyncMap{})
	pulumi.RegisterOutputType(ExpressSyncOutput{})
	pulumi.RegisterOutputType(ExpressSyncArrayOutput{})
	pulumi.RegisterOutputType(ExpressSyncMapOutput{})
}
