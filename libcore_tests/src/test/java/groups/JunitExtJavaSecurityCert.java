import libcore.io.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({

    libcore.java.security.cert.CertificateFactoryTest.class,
    libcore.java.security.cert.CRLReasonTest.class,
    libcore.java.security.cert.OldPKIXParametersTest.class,
    libcore.java.security.cert.PKIXParametersTest.class,
    libcore.java.security.cert.SubjectAlternativeNameTest.class,
    libcore.java.security.cert.X509CertificateTest.class,
    libcore.java.security.cert.X509CertSelectorTest.class,
    libcore.java.security.cert.X509CRLSelectorTest.class,
    libcore.java.security.cert.X509CRLTest.class,
    tests.security.cert.CertificateCertificateRepTest.class,
    tests.security.cert.CertificateEncodingException2Test.class,
    tests.security.cert.CertificateEncodingExceptionTest.class,
    tests.security.cert.CertificateException2Test.class,
    tests.security.cert.CertificateExceptionTest.class,
    tests.security.cert.CertificateExpiredExceptionTest.class,
    tests.security.cert.CertificateFactory1Test.class,
    tests.security.cert.CertificateFactory2Test.class,
    tests.security.cert.CertificateFactory3Test.class,
    tests.security.cert.CertificateFactory4Test.class,
    tests.security.cert.CertificateFactorySpiTest.class,
    tests.security.cert.CertificateNotYetValidExceptionTest.class,
    tests.security.cert.CertificateParsingExceptionTest.class,
    tests.security.cert.CertificateRevocationExceptionTest.class,
    tests.security.cert.CertificateTest.class,
    tests.security.cert.CertPathBuilder1Test.class,
    tests.security.cert.CertPathBuilder2Test.class,
    tests.security.cert.CertPathBuilderExceptionTest.class,
    tests.security.cert.CertPathBuilderSpiTest.class,
    tests.security.cert.CertPathCertPathRepTest.class,
    tests.security.cert.CertPathTest.class,
    tests.security.cert.CertPathValidator1Test.class,
    tests.security.cert.CertPathValidator2Test.class,
    tests.security.cert.CertPathValidator3Test.class,
    tests.security.cert.CertPathValidatorExceptionTest.class,
    tests.security.cert.CertPathValidatorSpiTest.class,
    tests.security.cert.CertStore1Test.class,
    tests.security.cert.CertStore2Test.class,
    tests.security.cert.CertStoreExceptionTest.class,
    tests.security.cert.CertStoreSpiTest.class,
    tests.security.cert.CollectionCertStoreParametersTest.class,
    tests.security.cert.CRLExceptionTest.class,
    tests.security.cert.CRLTest.class,
    tests.security.cert.LDAPCertStoreParametersTest.class,
    tests.security.cert.PKIXBuilderParametersTest.class,
    tests.security.cert.PKIXCertPathBuilderResultTest.class,
    tests.security.cert.PKIXCertPathCheckerTest.class,
    tests.security.cert.PKIXCertPathValidatorResultTest.class,
    tests.security.cert.PolicyQualifierInfoTest.class,
    tests.security.cert.TrustAnchorTest.class,
    tests.security.cert.X509Certificate2Test.class,
    tests.security.cert.X509CertSelectorTest.class,
    tests.security.cert.X509CRL2Test.class,
    tests.security.cert.X509CRLEntryTest.class,
    tests.security.cert.X509CRLSelector2Test.class,
    tests.security.cert.X509CRLSelectorTest.class,
    tests.security.cert.X509CRLTest.class,
    tests.targets.security.cert.CertificateTest.class,
	    
})
public class JunitExtJavaSecurityCert {
} 